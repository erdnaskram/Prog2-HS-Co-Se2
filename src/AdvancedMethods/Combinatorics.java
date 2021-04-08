package AdvancedMethods;

public class Combinatorics {

    int a = 5;

    public static float permutationOw(int n) {
        float result;
        result = (float) AdvacedMath.factorial(n);
        return result;
    }

    public static float permutationMw(int n) {
        float result;
        result = (float) AdvacedMath.factorial(n);
        return result;
    }

    public static float variationOw(int n, int k) {
        float result;
//        result = AdvacedMath.factorial(n)/AdvacedMath.factorial(n-k);
        result = (float) AdvacedMath.specialFactorial(n, n - k);
        return result;
    }

    public static float variationMw(int n, int k) {
        float result;
        result = (float) Math.pow(n, k);
        return result;
    }

    public static float kombinationOw(int n, int k) {
        float result;
        result = (float) (AdvacedMath.specialFactorial(n, n-k)/ AdvacedMath.factorial(k));
        return result;
    }

    public static float kombinationMw(int n , int k) {
        // K = Slots
        // n = Objekte
        float result;
        int f = n + k - 1;
        result = (float) (AdvacedMath.specialFactorial(f, f-k)/ AdvacedMath.factorial(k));
        return result;
    }


}
