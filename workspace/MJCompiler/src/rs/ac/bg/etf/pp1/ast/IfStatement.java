// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class IfStatement extends SingleStatement {

    private IfStmtCond IfStmtCond;
    private Statement Statement;
    private OptionalElse OptionalElse;

    public IfStatement (IfStmtCond IfStmtCond, Statement Statement, OptionalElse OptionalElse) {
        this.IfStmtCond=IfStmtCond;
        if(IfStmtCond!=null) IfStmtCond.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
        this.OptionalElse=OptionalElse;
        if(OptionalElse!=null) OptionalElse.setParent(this);
    }

    public IfStmtCond getIfStmtCond() {
        return IfStmtCond;
    }

    public void setIfStmtCond(IfStmtCond IfStmtCond) {
        this.IfStmtCond=IfStmtCond;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public OptionalElse getOptionalElse() {
        return OptionalElse;
    }

    public void setOptionalElse(OptionalElse OptionalElse) {
        this.OptionalElse=OptionalElse;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IfStmtCond!=null) IfStmtCond.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
        if(OptionalElse!=null) OptionalElse.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IfStmtCond!=null) IfStmtCond.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
        if(OptionalElse!=null) OptionalElse.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IfStmtCond!=null) IfStmtCond.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        if(OptionalElse!=null) OptionalElse.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("IfStatement(\n");

        if(IfStmtCond!=null)
            buffer.append(IfStmtCond.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalElse!=null)
            buffer.append(OptionalElse.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [IfStatement]");
        return buffer.toString();
    }
}
