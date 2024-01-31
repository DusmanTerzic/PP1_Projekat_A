// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class MoreConditionTerms extends MoreCondTerms {

    private CondTermHelper CondTermHelper;
    private MoreCondTerms MoreCondTerms;

    public MoreConditionTerms (CondTermHelper CondTermHelper, MoreCondTerms MoreCondTerms) {
        this.CondTermHelper=CondTermHelper;
        if(CondTermHelper!=null) CondTermHelper.setParent(this);
        this.MoreCondTerms=MoreCondTerms;
        if(MoreCondTerms!=null) MoreCondTerms.setParent(this);
    }

    public CondTermHelper getCondTermHelper() {
        return CondTermHelper;
    }

    public void setCondTermHelper(CondTermHelper CondTermHelper) {
        this.CondTermHelper=CondTermHelper;
    }

    public MoreCondTerms getMoreCondTerms() {
        return MoreCondTerms;
    }

    public void setMoreCondTerms(MoreCondTerms MoreCondTerms) {
        this.MoreCondTerms=MoreCondTerms;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondTermHelper!=null) CondTermHelper.accept(visitor);
        if(MoreCondTerms!=null) MoreCondTerms.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondTermHelper!=null) CondTermHelper.traverseTopDown(visitor);
        if(MoreCondTerms!=null) MoreCondTerms.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondTermHelper!=null) CondTermHelper.traverseBottomUp(visitor);
        if(MoreCondTerms!=null) MoreCondTerms.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreConditionTerms(\n");

        if(CondTermHelper!=null)
            buffer.append(CondTermHelper.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoreCondTerms!=null)
            buffer.append(MoreCondTerms.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreConditionTerms]");
        return buffer.toString();
    }
}
