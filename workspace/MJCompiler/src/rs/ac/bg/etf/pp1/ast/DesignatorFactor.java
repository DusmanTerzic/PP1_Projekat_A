// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class DesignatorFactor extends Factor {

    private Designator Designator;
    private OptActParsParen OptActParsParen;

    public DesignatorFactor (Designator Designator, OptActParsParen OptActParsParen) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.OptActParsParen=OptActParsParen;
        if(OptActParsParen!=null) OptActParsParen.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public OptActParsParen getOptActParsParen() {
        return OptActParsParen;
    }

    public void setOptActParsParen(OptActParsParen OptActParsParen) {
        this.OptActParsParen=OptActParsParen;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(OptActParsParen!=null) OptActParsParen.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(OptActParsParen!=null) OptActParsParen.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(OptActParsParen!=null) OptActParsParen.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorFactor(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptActParsParen!=null)
            buffer.append(OptActParsParen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorFactor]");
        return buffer.toString();
    }
}
