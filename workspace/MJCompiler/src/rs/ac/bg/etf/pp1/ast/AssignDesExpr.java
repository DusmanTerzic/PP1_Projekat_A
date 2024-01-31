// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class AssignDesExpr extends DesStmtChoice {

    private Assignop Assignop;
    private DesignatorExpr DesignatorExpr;

    public AssignDesExpr (Assignop Assignop, DesignatorExpr DesignatorExpr) {
        this.Assignop=Assignop;
        if(Assignop!=null) Assignop.setParent(this);
        this.DesignatorExpr=DesignatorExpr;
        if(DesignatorExpr!=null) DesignatorExpr.setParent(this);
    }

    public Assignop getAssignop() {
        return Assignop;
    }

    public void setAssignop(Assignop Assignop) {
        this.Assignop=Assignop;
    }

    public DesignatorExpr getDesignatorExpr() {
        return DesignatorExpr;
    }

    public void setDesignatorExpr(DesignatorExpr DesignatorExpr) {
        this.DesignatorExpr=DesignatorExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Assignop!=null) Assignop.accept(visitor);
        if(DesignatorExpr!=null) DesignatorExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Assignop!=null) Assignop.traverseTopDown(visitor);
        if(DesignatorExpr!=null) DesignatorExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Assignop!=null) Assignop.traverseBottomUp(visitor);
        if(DesignatorExpr!=null) DesignatorExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AssignDesExpr(\n");

        if(Assignop!=null)
            buffer.append(Assignop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorExpr!=null)
            buffer.append(DesignatorExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AssignDesExpr]");
        return buffer.toString();
    }
}
