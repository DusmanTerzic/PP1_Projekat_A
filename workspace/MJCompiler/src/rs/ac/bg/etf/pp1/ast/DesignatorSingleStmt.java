// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class DesignatorSingleStmt extends SingleStatement {

    private DesignatorSemi DesignatorSemi;

    public DesignatorSingleStmt (DesignatorSemi DesignatorSemi) {
        this.DesignatorSemi=DesignatorSemi;
        if(DesignatorSemi!=null) DesignatorSemi.setParent(this);
    }

    public DesignatorSemi getDesignatorSemi() {
        return DesignatorSemi;
    }

    public void setDesignatorSemi(DesignatorSemi DesignatorSemi) {
        this.DesignatorSemi=DesignatorSemi;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorSemi!=null) DesignatorSemi.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorSemi!=null) DesignatorSemi.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorSemi!=null) DesignatorSemi.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorSingleStmt(\n");

        if(DesignatorSemi!=null)
            buffer.append(DesignatorSemi.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorSingleStmt]");
        return buffer.toString();
    }
}
