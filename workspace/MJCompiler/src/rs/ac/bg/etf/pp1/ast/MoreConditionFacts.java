// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class MoreConditionFacts extends MoreCondFacts {

    private CondFactHelper CondFactHelper;
    private MoreCondFacts MoreCondFacts;

    public MoreConditionFacts (CondFactHelper CondFactHelper, MoreCondFacts MoreCondFacts) {
        this.CondFactHelper=CondFactHelper;
        if(CondFactHelper!=null) CondFactHelper.setParent(this);
        this.MoreCondFacts=MoreCondFacts;
        if(MoreCondFacts!=null) MoreCondFacts.setParent(this);
    }

    public CondFactHelper getCondFactHelper() {
        return CondFactHelper;
    }

    public void setCondFactHelper(CondFactHelper CondFactHelper) {
        this.CondFactHelper=CondFactHelper;
    }

    public MoreCondFacts getMoreCondFacts() {
        return MoreCondFacts;
    }

    public void setMoreCondFacts(MoreCondFacts MoreCondFacts) {
        this.MoreCondFacts=MoreCondFacts;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondFactHelper!=null) CondFactHelper.accept(visitor);
        if(MoreCondFacts!=null) MoreCondFacts.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondFactHelper!=null) CondFactHelper.traverseTopDown(visitor);
        if(MoreCondFacts!=null) MoreCondFacts.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondFactHelper!=null) CondFactHelper.traverseBottomUp(visitor);
        if(MoreCondFacts!=null) MoreCondFacts.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreConditionFacts(\n");

        if(CondFactHelper!=null)
            buffer.append(CondFactHelper.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoreCondFacts!=null)
            buffer.append(MoreCondFacts.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreConditionFacts]");
        return buffer.toString();
    }
}
