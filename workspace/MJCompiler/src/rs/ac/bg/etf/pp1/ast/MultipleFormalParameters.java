// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class MultipleFormalParameters extends MulFormPars {

    private MulFormPars MulFormPars;
    private FormParTypeName FormParTypeName;

    public MultipleFormalParameters (MulFormPars MulFormPars, FormParTypeName FormParTypeName) {
        this.MulFormPars=MulFormPars;
        if(MulFormPars!=null) MulFormPars.setParent(this);
        this.FormParTypeName=FormParTypeName;
        if(FormParTypeName!=null) FormParTypeName.setParent(this);
    }

    public MulFormPars getMulFormPars() {
        return MulFormPars;
    }

    public void setMulFormPars(MulFormPars MulFormPars) {
        this.MulFormPars=MulFormPars;
    }

    public FormParTypeName getFormParTypeName() {
        return FormParTypeName;
    }

    public void setFormParTypeName(FormParTypeName FormParTypeName) {
        this.FormParTypeName=FormParTypeName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MulFormPars!=null) MulFormPars.accept(visitor);
        if(FormParTypeName!=null) FormParTypeName.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MulFormPars!=null) MulFormPars.traverseTopDown(visitor);
        if(FormParTypeName!=null) FormParTypeName.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MulFormPars!=null) MulFormPars.traverseBottomUp(visitor);
        if(FormParTypeName!=null) FormParTypeName.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleFormalParameters(\n");

        if(MulFormPars!=null)
            buffer.append(MulFormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormParTypeName!=null)
            buffer.append(FormParTypeName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleFormalParameters]");
        return buffer.toString();
    }
}
