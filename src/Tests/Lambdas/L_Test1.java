package Tests.Lambdas;

public class L_Test1 {

    public static void main(String[] args) {
        Mathe add1 = (int a, int b) -> { return + b; };
        Mathe add2 = (int a, int b) -> a+b;
        Mathe add3 = (a, b) -> a+b;

        Mathe mult1 = (int a, int b) -> a*b;
        SngMathe mult2 = a -> a*2;

        System.out.println("add.ftk(5, 2) = " + add3.ftk(5, 2));
        System.out.println("mult.ftk(5, 2) = " + mult1.ftk(5, 2));
    }

    interface Mathe{
        int ftk(int a, int b);
    }

    interface SngMathe{
        int ftk(int a);
    }
}
