package Tests;

public class Test_04 {
    interface Something{
        int calc(double d, int f);
    }
    interface FuncConst{
        float con();
    }

    public static void main(String[] args) {
        Something func = (d, f) -> {
            System.out.println("bla");
            return (int) d + f;
        };

        Something func2 = (d,f) -> (int) (3*d+f-55);

        System.out.println("func2.calc(3,2) = " + func2.calc(8, 9));

        System.out.println("func.calc(1,2) = " + func.calc(1, 2));

        FuncConst pi = () -> (float) 3.1415;

        System.out.println("pi.con() = " + pi.con());


        //-----------------------------------




    }
}
