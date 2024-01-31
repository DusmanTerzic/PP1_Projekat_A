// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class ReturnStmt extends SingleStatement {

    private OptSimpleExpr OptSimpleExpr;

    public ReturnStmt (OptSimpleExpr OptSimpleExpr) {
        this.OptSimpleExpr=OptSimpleExpr;
        if(OptSimpleExpr!=null) OptSimpleExpr.setParent(this);
    }

    public OptSimpleExpr getOptSimpleExpr() {
        return OptSimpleExpr;
    }

    public void setOptSimpleExpr(OptSimpleExpr OptSimpleExpr) {
        this.OptSimpleExpr=OptSimpleExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptSimpleExpr!=null) OptSimpleExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptSimpleExpr!=null) OptSimpleExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptSimpleExpr!=null) OptSimpleExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ReturnStmt(\n");

        if(OptSimpleExpr!=null)
            buffer.append(OptSimpleExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ReturnStmt]");
        return buffer.toString();
    }
}
