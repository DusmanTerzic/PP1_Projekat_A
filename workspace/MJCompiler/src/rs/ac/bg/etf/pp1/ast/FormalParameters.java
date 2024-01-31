// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class FormalParameters extends FormPars {

    private FormParTypeName FormParTypeName;
    private MulFormPars MulFormPars;

    public FormalParameters (FormParTypeName FormParTypeName, MulFormPars MulFormPars) {
        this.FormParTypeName=FormParTypeName;
        if(FormParTypeName!=null) FormParTypeName.setParent(this);
        this.MulFormPars=MulFormPars;
        if(MulFormPars!=null) MulFormPars.setParent(this);
    }

    public FormParTypeName getFormParTypeName() {
        return FormParTypeName;
    }

    public void setFormParTypeName(FormParTypeName FormParTypeName) {
        this.FormParTypeName=FormParTypeName;
    }

    public MulFormPars getMulFormPars() {
        return MulFormPars;
    }

    public void setMulFormPars(MulFormPars MulFormPars) {
        this.MulFormPars=MulFormPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormParTypeName!=null) FormParTypeName.accept(visitor);
        if(MulFormPars!=null) MulFormPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormParTypeName!=null) FormParTypeName.traverseTopDown(visitor);
        if(MulFormPars!=null) MulFormPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormParTypeName!=null) FormParTypeName.traverseBottomUp(visitor);
        if(MulFormPars!=null) MulFormPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParameters(\n");

        if(FormParTypeName!=null)
            buffer.append(FormParTypeName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MulFormPars!=null)
            buffer.append(MulFormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParameters]");
        return buffer.toString();
    }
}
