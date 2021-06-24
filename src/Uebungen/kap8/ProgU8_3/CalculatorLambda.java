package Uebungen.kap8.ProgU8_3;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class CalculatorLambda {

    public static void main(String[] args) {

        DoubleBinaryOperator division = (a,b) -> a/b;
        IntBinaryOperator multiplikation = (a,b) -> a*b;
        IntBinaryOperator addition = (a,b) -> a+b;
        IntBinaryOperator subtraktion = (a,b) -> a-b;
        IntUnaryOperator dekrement = a -> a-1;
        IntUnaryOperator inkrement = a -> a+1;

        System.out.println("20 / 4 = " + division.applyAsDouble(20, 4));
        System.out.println("4 * 5 = " + multiplikation.applyAsInt(5, 4));
        System.out.println("14 + 4 = " + addition.applyAsInt(14, 4));
        System.out.println("48 - 29 = " + subtraktion.applyAsInt(48, 29));
        System.out.println("inc(8) = " + dekrement.applyAsInt(8));
        System.out.println("dec(7) = " + inkrement.applyAsInt(7));

    }
}
