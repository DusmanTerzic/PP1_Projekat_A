// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class MoreTermsAdded extends MoreTerms {

    private AddedTerm AddedTerm;
    private MoreTerms MoreTerms;

    public MoreTermsAdded (AddedTerm AddedTerm, MoreTerms MoreTerms) {
        this.AddedTerm=AddedTerm;
        if(AddedTerm!=null) AddedTerm.setParent(this);
        this.MoreTerms=MoreTerms;
        if(MoreTerms!=null) MoreTerms.setParent(this);
    }

    public AddedTerm getAddedTerm() {
        return AddedTerm;
    }

    public void setAddedTerm(AddedTerm AddedTerm) {
        this.AddedTerm=AddedTerm;
    }

    public MoreTerms getMoreTerms() {
        return MoreTerms;
    }

    public void setMoreTerms(MoreTerms MoreTerms) {
        this.MoreTerms=MoreTerms;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AddedTerm!=null) AddedTerm.accept(visitor);
        if(MoreTerms!=null) MoreTerms.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AddedTerm!=null) AddedTerm.traverseTopDown(visitor);
        if(MoreTerms!=null) MoreTerms.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AddedTerm!=null) AddedTerm.traverseBottomUp(visitor);
        if(MoreTerms!=null) MoreTerms.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreTermsAdded(\n");

        if(AddedTerm!=null)
            buffer.append(AddedTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoreTerms!=null)
            buffer.append(MoreTerms.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreTermsAdded]");
        return buffer.toString();
    }
}
