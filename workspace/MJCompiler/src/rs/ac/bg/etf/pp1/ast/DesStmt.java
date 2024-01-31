// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class DesStmt extends DesignatorStatement {

    private Designator Designator;
    private DesStmtChoice DesStmtChoice;

    public DesStmt (Designator Designator, DesStmtChoice DesStmtChoice) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.DesStmtChoice=DesStmtChoice;
        if(DesStmtChoice!=null) DesStmtChoice.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public DesStmtChoice getDesStmtChoice() {
        return DesStmtChoice;
    }

    public void setDesStmtChoice(DesStmtChoice DesStmtChoice) {
        this.DesStmtChoice=DesStmtChoice;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(DesStmtChoice!=null) DesStmtChoice.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(DesStmtChoice!=null) DesStmtChoice.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(DesStmtChoice!=null) DesStmtChoice.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesStmt(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesStmtChoice!=null)
            buffer.append(DesStmtChoice.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesStmt]");
        return buffer.toString();
    }
}
