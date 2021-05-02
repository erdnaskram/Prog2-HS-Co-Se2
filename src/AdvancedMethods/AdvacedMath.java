package AdvancedMethods;

public class AdvacedMath {

    public static double factorial(int n) {//returns factorial of n
        double result = 1;
        for (int j = n; j > 0; j--) {
            result = result * j;
        }
        return result;
    }

    public static double specialFactorial(int n, int k) {//returns fractorial from n to k
        double result = 1;
        for (int j = n; j > k; j--) {
            result = result * j;
        }
        return result;
    }

    public static double pow(double i, double n){
        return Math.pow(i,n);
    }



}
