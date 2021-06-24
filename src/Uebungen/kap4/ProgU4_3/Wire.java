package Uebungen.kap4.ProgU4_3;

public class Wire implements Mobile{

    private final Mobile mobile1;
    private final Mobile mobile2;
    private double länge1;
    private double länge2;

    public Wire (Mobile mobile1, Mobile mobile2, double länge1, double länge2){
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.länge1 = länge1;
        this.länge2 = länge2;
    }

    @Override
    public void balance (){
        double gesLänge = (länge1 + länge2);
        länge1 = gesLänge * mobile2.weight() / (mobile1.weight() + mobile2.weight());
        länge2 = gesLänge * mobile1.weight() / (mobile1.weight() + mobile2.weight());
    }

    @Override
    public double weight() {
        return mobile1.weight() + mobile2.weight();
    }

    @Override
    public String toString() {
        return "Wire{" +
                "mobile1=" + mobile1 +
                ", mobile2=" + mobile2 +
                ", länge1=" + länge1 +
                ", länge2=" + länge2 +
                '}';
    }
}
