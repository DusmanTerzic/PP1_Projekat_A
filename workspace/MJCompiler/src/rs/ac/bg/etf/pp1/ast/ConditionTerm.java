// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class ConditionTerm extends CondTerm {

    private CondFact CondFact;
    private MoreCondFacts MoreCondFacts;

    public ConditionTerm (CondFact CondFact, MoreCondFacts MoreCondFacts) {
        this.CondFact=CondFact;
        if(CondFact!=null) CondFact.setParent(this);
        this.MoreCondFacts=MoreCondFacts;
        if(MoreCondFacts!=null) MoreCondFacts.setParent(this);
    }

    public CondFact getCondFact() {
        return CondFact;
    }

    public void setCondFact(CondFact CondFact) {
        this.CondFact=CondFact;
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
        if(CondFact!=null) CondFact.accept(visitor);
        if(MoreCondFacts!=null) MoreCondFacts.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondFact!=null) CondFact.traverseTopDown(visitor);
        if(MoreCondFacts!=null) MoreCondFacts.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondFact!=null) CondFact.traverseBottomUp(visitor);
        if(MoreCondFacts!=null) MoreCondFacts.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConditionTerm(\n");

        if(CondFact!=null)
            buffer.append(CondFact.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoreCondFacts!=null)
            buffer.append(MoreCondFacts.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConditionTerm]");
        return buffer.toString();
    }
}
