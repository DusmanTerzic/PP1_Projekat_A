// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(FormPars FormPars);
    public void visit(DesStmtChoice DesStmtChoice);
    public void visit(DesignatorHelper DesignatorHelper);
    public void visit(Factor Factor);
    public void visit(Statement Statement);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(MoreFactors MoreFactors);
    public void visit(ProgramDecl ProgramDecl);
    public void visit(Relop Relop);
    public void visit(OptRelopExpr OptRelopExpr);
    public void visit(Expr Expr);
    public void visit(MoreTerms MoreTerms);
    public void visit(OptSimpleExpr OptSimpleExpr);
    public void visit(VarDecl VarDecl);
    public void visit(CondFactHelper CondFactHelper);
    public void visit(ConstType ConstType);
    public void visit(DesignatorExpr DesignatorExpr);
    public void visit(OptActPars OptActPars);
    public void visit(OptionalExtends OptionalExtends);
    public void visit(DesignatorHelperArray DesignatorHelperArray);
    public void visit(IfStmtCond IfStmtCond);
    public void visit(DesignatorList DesignatorList);
    public void visit(Mulop Mulop);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(NamespaceList NamespaceList);
    public void visit(Addop Addop);
    public void visit(StatementList StatementList);
    public void visit(Assignop Assignop);
    public void visit(Type Type);
    public void visit(OptExpr OptExpr);
    public void visit(MoreCondFacts MoreCondFacts);
    public void visit(CondTerm CondTerm);
    public void visit(VarList VarList);
    public void visit(OptActParsParen OptActParsParen);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(MethodType MethodType);
    public void visit(OptNumConst OptNumConst);
    public void visit(MoreExprs MoreExprs);
    public void visit(ProgramDeclList ProgramDeclList);
    public void visit(OptionalClassDecls OptionalClassDecls);
    public void visit(DesignatorSemi DesignatorSemi);
    public void visit(MoreCondTerms MoreCondTerms);
    public void visit(OptionalElse OptionalElse);
    public void visit(MulFormPars MulFormPars);
    public void visit(Designator Designator);
    public void visit(VarDeclList VarDeclList);
    public void visit(CondFact CondFact);
    public void visit(FormParsRparen FormParsRparen);
    public void visit(CondTermHelper CondTermHelper);
    public void visit(OptionalBrackets OptionalBrackets);
    public void visit(SingleStatement SingleStatement);
    public void visit(DesignatorHelperClassField DesignatorHelperClassField);
    public void visit(NoOptRelop NoOptRelop);
    public void visit(OptRelop OptRelop);
    public void visit(ConditionFact ConditionFact);
    public void visit(NoMoreCondFacts NoMoreCondFacts);
    public void visit(MoreConditionFacts MoreConditionFacts);
    public void visit(CondFactsHelp CondFactsHelp);
    public void visit(ConditionTerm ConditionTerm);
    public void visit(NoMoreCondTerms NoMoreCondTerms);
    public void visit(MoreConditionTerms MoreConditionTerms);
    public void visit(CondTermHelp CondTermHelp);
    public void visit(Condition Condition);
    public void visit(ModOp ModOp);
    public void visit(DivOp DivOp);
    public void visit(MultiplyOp MultiplyOp);
    public void visit(MinusOp MinusOp);
    public void visit(PlusOp PlusOp);
    public void visit(LEQOp LEQOp);
    public void visit(LesserOp LesserOp);
    public void visit(GEQOp GEQOp);
    public void visit(GreaterOp GreaterOp);
    public void visit(NEqualOp NEqualOp);
    public void visit(IsEqualOp IsEqualOp);
    public void visit(AssignOperator AssignOperator);
    public void visit(NoActPars NoActPars);
    public void visit(OptionalActPars OptionalActPars);
    public void visit(NoMoreExprs NoMoreExprs);
    public void visit(MoreExpressions MoreExpressions);
    public void visit(CommaExpr CommaExpr);
    public void visit(NoOptActParsParen NoOptActParsParen);
    public void visit(NoParsWithParen NoParsWithParen);
    public void visit(OptionalActParsParen OptionalActParsParen);
    public void visit(ActPars ActPars);
    public void visit(NoOptSimExpr NoOptSimExpr);
    public void visit(OptionalSimpleExpr OptionalSimpleExpr);
    public void visit(NoOptionalExpr NoOptionalExpr);
    public void visit(OptionalExpr OptionalExpr);
    public void visit(MinusFactor MinusFactor);
    public void visit(DesignatorFactor DesignatorFactor);
    public void visit(NewFactor NewFactor);
    public void visit(ExprFactor ExprFactor);
    public void visit(BoolFactor BoolFactor);
    public void visit(CharFactor CharFactor);
    public void visit(NumFactor NumFactor);
    public void visit(AddedFactor AddedFactor);
    public void visit(NoMoreFactors NoMoreFactors);
    public void visit(MoreFactorsAdded MoreFactorsAdded);
    public void visit(NoMoreTerms NoMoreTerms);
    public void visit(MoreTermsAdded MoreTermsAdded);
    public void visit(AddedTerm AddedTerm);
    public void visit(Term Term);
    public void visit(PositiveExpr PositiveExpr);
    public void visit(Label Label);
    public void visit(FindAnyExpr FindAnyExpr);
    public void visit(DesExpr DesExpr);
    public void visit(ActParsDes ActParsDes);
    public void visit(DecDes DecDes);
    public void visit(IncDes IncDes);
    public void visit(AssignDesExpr AssignDesExpr);
    public void visit(ErrorStmt ErrorStmt);
    public void visit(DesSemi DesSemi);
    public void visit(DesStmt DesStmt);
    public void visit(DesignatorBrack DesignatorBrack);
    public void visit(DesNsIdent DesNsIdent);
    public void visit(DesIdent DesIdent);
    public void visit(DesDotIdent DesDotIdent);
    public void visit(DesBrackExpr DesBrackExpr);
    public void visit(TypeSimple TypeSimple);
    public void visit(TypeNs TypeNs);
    public void visit(NoOptNumConst NoOptNumConst);
    public void visit(OptionalNumConst OptionalNumConst);
    public void visit(NoOptElse NoOptElse);
    public void visit(OptElse OptElse);
    public void visit(IfCondError IfCondError);
    public void visit(If If);
    public void visit(WhileExpr WhileExpr);
    public void visit(WhileStatement WhileStatement);
    public void visit(IfStatement IfStatement);
    public void visit(PrintStmt PrintStmt);
    public void visit(DesignatorSingleStmt DesignatorSingleStmt);
    public void visit(ReadStmt ReadStmt);
    public void visit(ReturnStmt ReturnStmt);
    public void visit(ContinueSingle ContinueSingle);
    public void visit(BreakSingle BreakSingle);
    public void visit(Statements Statements);
    public void visit(StatementsMultiple StatementsMultiple);
    public void visit(StatementSingle StatementSingle);
    public void visit(StaticInitializer StaticInitializer);
    public void visit(NoStatementList NoStatementList);
    public void visit(StmtList StmtList);
    public void visit(FormParsErrorComma FormParsErrorComma);
    public void visit(NoMulFormPars NoMulFormPars);
    public void visit(MultipleFormalParameters MultipleFormalParameters);
    public void visit(FormParTypeName FormParTypeName);
    public void visit(NoFormPars NoFormPars);
    public void visit(FormalParameters FormalParameters);
    public void visit(FormParsErrorParen FormParsErrorParen);
    public void visit(FormRParen FormRParen);
    public void visit(NoType NoType);
    public void visit(MethType MethType);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(MethodDecl MethodDecl);
    public void visit(NoMethodDecls NoMethodDecls);
    public void visit(MethodDeclarationList MethodDeclarationList);
    public void visit(NoOptClassDeclarations NoOptClassDeclarations);
    public void visit(OptionalClassDeclarations OptionalClassDeclarations);
    public void visit(NoExtends NoExtends);
    public void visit(Extends Extends);
    public void visit(ClassName ClassName);
    public void visit(ClassDecl ClassDecl);
    public void visit(VarDeclErr2 VarDeclErr2);
    public void visit(NoVars NoVars);
    public void visit(Vars Vars);
    public void visit(NoOptBrackets NoOptBrackets);
    public void visit(OptBrackets OptBrackets);
    public void visit(NoVarDeclarations NoVarDeclarations);
    public void visit(VarDeclarations VarDeclarations);
    public void visit(VarName VarName);
    public void visit(VarType VarType);
    public void visit(VarDeclErr1 VarDeclErr1);
    public void visit(VarDeclaration VarDeclaration);
    public void visit(NoConstList NoConstList);
    public void visit(ConstList ConstList);
    public void visit(BoolConst BoolConst);
    public void visit(CharConst CharConst);
    public void visit(NumberConst NumberConst);
    public void visit(ConstTypeDecl ConstTypeDecl);
    public void visit(ConstDecl ConstDecl);
    public void visit(ClassProgramDecl ClassProgramDecl);
    public void visit(VarProgramDecl VarProgramDecl);
    public void visit(ConstProgramDecl ConstProgramDecl);
    public void visit(NoProgramDeclarations NoProgramDeclarations);
    public void visit(ProgramDeclarations ProgramDeclarations);
    public void visit(NamespaceName NamespaceName);
    public void visit(Namespace Namespace);
    public void visit(NoNamespaces NoNamespaces);
    public void visit(Namespaces Namespaces);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}