package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.*;

public class CodeGenerator extends VisitorAdaptor{
	private int mainPc;
	private boolean desBrackLoaded = false;
	private boolean openArrayBracks = false;
	private Designator des;
	
	public int getMainPc(){
		return mainPc;
	}
	
	public void visit(MethodDecl methDecl) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(MethodTypeName mtn) {
		if("main".equalsIgnoreCase(mtn.getMethName())){
			mainPc = Code.pc;
		}
		
		mtn.obj.setAdr(Code.pc);
		SyntaxNode methodNode = mtn.getParent();
	
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(fpCnt.getCount() + varCnt.getCount());
	}
	
	public void visit(PrintStmt printStmt) {
		int exprKind = printStmt.getExpr().struct.getKind();
		Code.put(Code.const_5);
		if (exprKind == Struct.Char) {
			Code.put(Code.bprint);
		} else {
			Code.put(Code.print);
		}
	}
	
	public void visit(ReadStmt readStmt) {
		Obj d = readStmt.getDesignator().obj;
		Struct dType = d.getType();
		if (dType == Tab.intType) {
			Code.put(Code.read);
			Code.store(d);
			if (dType.getKind() == Struct.Array) {
				Code.put(Code.read);
				Code.put(Code.astore);
			}
		} else {
			Code.put(Code.bread);
			Code.store(d);
			if (dType.getKind() == Struct.Array) {
				Code.put(Code.bread);
				Code.put(Code.bastore);
			}
		}
	}
	
	public void visit(DesStmt ds) {
		Obj des = ds.getDesignator().obj;
		if(ds.getDesStmtChoice() instanceof IncDes) {
			if (des.getType().getKind() == Struct.Array) {
				Code.put(Code.dup2);
				Code.put(Code.aload);
				Code.loadConst(1);
				Code.put(Code.add);
				Code.put(Code.astore);
			}
			else {
				Code.load(des);
				Code.loadConst(1);
				Code.put(Code.add);
				Code.store(des);
			}
		} else if(ds.getDesStmtChoice() instanceof DecDes) {
			if (des.getType().getKind() == Struct.Array) {
				Code.put(Code.dup2);
				Code.put(Code.aload);
				Code.loadConst(-1);
				Code.put(Code.add);
				Code.put(Code.astore);
			}
			else {
				Code.load(des);
				Code.loadConst(-1);
				Code.put(Code.add);
				Code.store(des);
			}
		} else if(ds.getDesStmtChoice() instanceof AssignDesExpr) {
			DesignatorExpr desExpr = ((AssignDesExpr)ds.getDesStmtChoice()).getDesignatorExpr();	
			if(desExpr instanceof DesExpr) {
				if (des.getType().getKind() == Struct.Array && ((DesExpr)desExpr).getExpr().struct.getKind() != Struct.Array) {
					if (des.getType().getElemType() == Tab.charType) {
						Code.put(Code.bastore);
					} else {
						Code.put(Code.astore);
					}
				} else {
					Code.store(des);
				}
			} else { //find any
				
			}
			
		}
	}
	
	public void visit(SingleStatement stmt) {
		if(stmt instanceof ReadStmt) {
			//
		} else if(stmt instanceof PrintStmt) {
			//
		} else if(stmt instanceof DesignatorSingleStmt) {
			DesignatorSingleStmt desSStmt = (DesignatorSingleStmt) stmt;
			DesignatorStatement desStmt = ((DesSemi)desSStmt.getDesignatorSemi()).getDesignatorStatement();
		}
	}
	
	public void visit(NumFactor f) {
		Code.load(new Obj(Obj.Con, "$", f.struct, f.getN1(), 0));
	}

	public void visit(CharFactor f) {
		Code.load(new Obj(Obj.Con, "$", f.struct, f.getC1(), 0));
	}

	public void visit(BoolFactor f) {
		int val;
		if(f.getB1().equals("true")) val = 1;
		else val = 0;
		Code.load(new Obj(Obj.Con, "$", f.struct, val, 0));
	}
	
	public void visit(NewFactor f) {
		Expr ex;
		if(f.getOptExpr() instanceof OptionalExpr) {
			OptionalExpr oe = (OptionalExpr) f.getOptExpr();
			ex = oe.getExpr();
			if (ex.struct.getKind() == Struct.Int) {
				Code.put(Code.newarray);
				Code.put(1);
			} else {
				Code.put(Code.newarray);
				Code.put(0);
			}
		}
	}
	
	public void visit(MinusFactor f) {
		Code.put(Code.neg);
	}
	
	public void visit(DesignatorFactor desF) {
		if(!(desF.getDesignator() instanceof DesBrackExpr))
			Code.load(desF.getDesignator().obj);
	}
	
	public void visit(DesBrackExpr dbe) {
		if(!(dbe.getParent() instanceof DesStmt))
		{
			if(dbe.getDesignatorBrack().getDesignator().obj.getType() == Tab.charType)
				Code.put(Code.baload);
			else Code.put(Code.aload);
		}
	}
	
	public void visit(DesignatorBrack db) {
		Code.load(db.getDesignator().obj);
	}
	
	public void visit(FindAnyExpr fae){
		boolean found = false;
		
		Obj myArray = fae.getDesignator().obj;
		if(myArray.getType().getKind() == Struct.Array) {
			//na vrhu steka mi je 6 iz Expr
			int startAddress = Code.pc;
			int start = myArray.getAdr();
			
			//sad su 6 i moja adresa
			Code.loadConst(myArray.getAdr()); //+4
			Code.put(Code.load_n); //+1
			Code.putFalseJump(Code.eq, startAddress+15); //5
			Code.loadConst(1); //4
			
			Code.putJump(startAddress + 5);
			//Jednaki su, zavrsi
			Code.loadConst(1);

			//sad je 6 i duzina niza
			Code.put(Code.arraylength);
			Code.put(Code.jcc + Code.eq); //1
			//Code.put2(start + );
		}
	}
	
	public void visit(MoreFactorsAdded tmf) {
		Mulop m = tmf.getMulop();
		if (m instanceof MultiplyOp) {
			Code.put(Code.mul);
		} else if (m instanceof ModOp) {
			Code.put(Code.rem);
		} else {
			Code.put(Code.div);
		}
	}
	
	public void visit(MoreTermsAdded el) {
		Addop a = el.getAddedTerm().getAddop();
		if (a instanceof MinusOp) {
			Code.put(Code.sub);
		} else {
			Code.put(Code.add);
		}
	}
}
