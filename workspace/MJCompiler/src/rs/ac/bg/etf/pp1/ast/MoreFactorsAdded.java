// generated with ast extension for cup
// version 0.8
// 15/0/2024 21:27:39


package rs.ac.bg.etf.pp1.ast;

public class MoreFactorsAdded extends MoreFactors {

    private Mulop Mulop;
    private Factor Factor;
    private MoreFactors MoreFactors;

    public MoreFactorsAdded (Mulop Mulop, Factor Factor, MoreFactors MoreFactors) {
        this.Mulop=Mulop;
        if(Mulop!=null) Mulop.setParent(this);
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MoreFactors=MoreFactors;
        if(MoreFactors!=null) MoreFactors.setParent(this);
    }

    public Mulop getMulop() {
        return Mulop;
    }

    public void setMulop(Mulop Mulop) {
        this.Mulop=Mulop;
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
    }

    public MoreFactors getMoreFactors() {
        return MoreFactors;
    }

    public void setMoreFactors(MoreFactors MoreFactors) {
        this.MoreFactors=MoreFactors;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Mulop!=null) Mulop.accept(visitor);
        if(Factor!=null) Factor.accept(visitor);
        if(MoreFactors!=null) MoreFactors.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Mulop!=null) Mulop.traverseTopDown(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MoreFactors!=null) MoreFactors.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Mulop!=null) Mulop.traverseBottomUp(visitor);
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        if(MoreFactors!=null) MoreFactors.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreFactorsAdded(\n");

        if(Mulop!=null)
            buffer.append(Mulop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoreFactors!=null)
            buffer.append(MoreFactors.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreFactorsAdded]");
        return buffer.toString();
    }
}
