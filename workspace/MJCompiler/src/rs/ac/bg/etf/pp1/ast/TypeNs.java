// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class TypeNs extends Type {

    private String nsName;
    private String typeName;

    public TypeNs (String nsName, String typeName) {
        this.nsName=nsName;
        this.typeName=typeName;
    }

    public String getNsName() {
        return nsName;
    }

    public void setNsName(String nsName) {
        this.nsName=nsName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName=typeName;
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
        buffer.append("TypeNs(\n");

        buffer.append(" "+tab+nsName);
        buffer.append("\n");

        buffer.append(" "+tab+typeName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TypeNs]");
        return buffer.toString();
    }
}
