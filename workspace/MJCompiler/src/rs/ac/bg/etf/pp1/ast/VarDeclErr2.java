// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class VarDeclErr2 extends VarList {

    public VarDeclErr2 () {
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
        buffer.append("VarDeclErr2(\n");

        buffer.append(tab);
        buffer.append(") [VarDeclErr2]");
        return buffer.toString();
    }
}
