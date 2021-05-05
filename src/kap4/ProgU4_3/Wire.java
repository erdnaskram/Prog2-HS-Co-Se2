package kap4.ProgU4_3;

public class Wire implements Mobile{

    private Mobile mobile1;
    private Mobile mobile2;
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
        while (mobile1.weight() * länge1 != mobile2.weight() * länge2) {
            double div = (mobile1.weight() * länge1 - mobile2.weight() * länge2) / 2;
            länge1 -= div;
            länge2 += div;
        }
    }

    @Override
    public double weight() {
        return 0;
    }

}
