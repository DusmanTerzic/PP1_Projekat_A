// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class MoreExpressions extends MoreExprs {

    private CommaExpr CommaExpr;
    private MoreExprs MoreExprs;

    public MoreExpressions (CommaExpr CommaExpr, MoreExprs MoreExprs) {
        this.CommaExpr=CommaExpr;
        if(CommaExpr!=null) CommaExpr.setParent(this);
        this.MoreExprs=MoreExprs;
        if(MoreExprs!=null) MoreExprs.setParent(this);
    }

    public CommaExpr getCommaExpr() {
        return CommaExpr;
    }

    public void setCommaExpr(CommaExpr CommaExpr) {
        this.CommaExpr=CommaExpr;
    }

    public MoreExprs getMoreExprs() {
        return MoreExprs;
    }

    public void setMoreExprs(MoreExprs MoreExprs) {
        this.MoreExprs=MoreExprs;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CommaExpr!=null) CommaExpr.accept(visitor);
        if(MoreExprs!=null) MoreExprs.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CommaExpr!=null) CommaExpr.traverseTopDown(visitor);
        if(MoreExprs!=null) MoreExprs.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CommaExpr!=null) CommaExpr.traverseBottomUp(visitor);
        if(MoreExprs!=null) MoreExprs.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreExpressions(\n");

        if(CommaExpr!=null)
            buffer.append(CommaExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoreExprs!=null)
            buffer.append(MoreExprs.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreExpressions]");
        return buffer.toString();
    }
}
