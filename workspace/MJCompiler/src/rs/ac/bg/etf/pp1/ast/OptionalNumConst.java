// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class OptionalNumConst extends OptNumConst {

    private Integer N1;

    public OptionalNumConst (Integer N1) {
        this.N1=N1;
    }

    public Integer getN1() {
        return N1;
    }

    public void setN1(Integer N1) {
        this.N1=N1;
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
        buffer.append("OptionalNumConst(\n");

        buffer.append(" "+tab+N1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalNumConst]");
        return buffer.toString();
    }
}
