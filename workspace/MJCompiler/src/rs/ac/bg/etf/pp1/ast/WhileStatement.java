// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class WhileStatement extends SingleStatement {

    private WhileExpr WhileExpr;
    private Statement Statement;

    public WhileStatement (WhileExpr WhileExpr, Statement Statement) {
        this.WhileExpr=WhileExpr;
        if(WhileExpr!=null) WhileExpr.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public WhileExpr getWhileExpr() {
        return WhileExpr;
    }

    public void setWhileExpr(WhileExpr WhileExpr) {
        this.WhileExpr=WhileExpr;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(WhileExpr!=null) WhileExpr.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(WhileExpr!=null) WhileExpr.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(WhileExpr!=null) WhileExpr.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("WhileStatement(\n");

        if(WhileExpr!=null)
            buffer.append(WhileExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [WhileStatement]");
        return buffer.toString();
    }
}
