// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class DesIdent extends Designator {

    private String name;

    public DesIdent (String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesIdent(\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesIdent]");
        return buffer.toString();
    }
}