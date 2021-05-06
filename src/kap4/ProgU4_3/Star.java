package kap4.ProgU4_3;

public class Star implements Mobile{
    double weight;

    public Star(double weight){
        if (weight<0){
            throw new IllegalArgumentException("Weight had to be positive");
        }else {
            this.weight = weight;
        }

    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public void balance() {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "Star{" +
                "weight=" + weight +
                '}';
    }
}
