// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class DesBrackExpr extends Designator {

    private DesignatorBrack DesignatorBrack;
    private Expr Expr;

    public DesBrackExpr (DesignatorBrack DesignatorBrack, Expr Expr) {
        this.DesignatorBrack=DesignatorBrack;
        if(DesignatorBrack!=null) DesignatorBrack.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public DesignatorBrack getDesignatorBrack() {
        return DesignatorBrack;
    }

    public void setDesignatorBrack(DesignatorBrack DesignatorBrack) {
        this.DesignatorBrack=DesignatorBrack;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorBrack!=null) DesignatorBrack.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorBrack!=null) DesignatorBrack.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorBrack!=null) DesignatorBrack.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesBrackExpr(\n");

        if(DesignatorBrack!=null)
            buffer.append(DesignatorBrack.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesBrackExpr]");
        return buffer.toString();
    }
}
