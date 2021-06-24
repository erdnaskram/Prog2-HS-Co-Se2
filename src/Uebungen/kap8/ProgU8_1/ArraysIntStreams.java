package Uebungen.kap8.ProgU8_1;

import java.util.Arrays;
import java.util.List;

public class ArraysIntStreams {

    public static void main(String[] args) {

        Integer[] values= { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };

        List<Integer> list= Arrays.asList(values);
    // AusgabeallerWerte von values<...>

        System.out.println("LVL1");

        for (Integer value : values) {
            System.out.print(value + " ");
        }

        System.out.println("\nLVL2");

        Arrays.stream(values).forEach((Integer value) -> {
            System.out.print(value + " ");
        });

        System.out.println("\nLVL3");

        Arrays.stream(values).forEach((Integer value) -> System.out.printf("%d ", value));

        System.out.println("\nLVL4");

        Arrays.stream(values).forEach(System.out::print);

        System.out.println("\nLVL5");

        Arrays.stream(values).sorted().forEach(System.out::print);

    }
}