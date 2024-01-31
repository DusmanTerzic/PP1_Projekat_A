// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class ClassDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ClassName ClassName;
    private OptionalExtends OptionalExtends;
    private VarDeclList VarDeclList;
    private OptionalClassDecls OptionalClassDecls;

    public ClassDecl (ClassName ClassName, OptionalExtends OptionalExtends, VarDeclList VarDeclList, OptionalClassDecls OptionalClassDecls) {
        this.ClassName=ClassName;
        if(ClassName!=null) ClassName.setParent(this);
        this.OptionalExtends=OptionalExtends;
        if(OptionalExtends!=null) OptionalExtends.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.OptionalClassDecls=OptionalClassDecls;
        if(OptionalClassDecls!=null) OptionalClassDecls.setParent(this);
    }

    public ClassName getClassName() {
        return ClassName;
    }

    public void setClassName(ClassName ClassName) {
        this.ClassName=ClassName;
    }

    public OptionalExtends getOptionalExtends() {
        return OptionalExtends;
    }

    public void setOptionalExtends(OptionalExtends OptionalExtends) {
        this.OptionalExtends=OptionalExtends;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public OptionalClassDecls getOptionalClassDecls() {
        return OptionalClassDecls;
    }

    public void setOptionalClassDecls(OptionalClassDecls OptionalClassDecls) {
        this.OptionalClassDecls=OptionalClassDecls;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassName!=null) ClassName.accept(visitor);
        if(OptionalExtends!=null) OptionalExtends.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(OptionalClassDecls!=null) OptionalClassDecls.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassName!=null) ClassName.traverseTopDown(visitor);
        if(OptionalExtends!=null) OptionalExtends.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(OptionalClassDecls!=null) OptionalClassDecls.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassName!=null) ClassName.traverseBottomUp(visitor);
        if(OptionalExtends!=null) OptionalExtends.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(OptionalClassDecls!=null) OptionalClassDecls.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDecl(\n");

        if(ClassName!=null)
            buffer.append(ClassName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalExtends!=null)
            buffer.append(OptionalExtends.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalClassDecls!=null)
            buffer.append(OptionalClassDecls.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDecl]");
        return buffer.toString();
    }
}
