package Tests;

import java.util.Arrays;

public class Test_05 {
    public static void main(String[] args) {
        String[] txt = {"This", "is", "a", "stream", "demo"};

        System.out.println("Arrays.stream(txt).filter(s -> s.length() >3)\n" +
                ".mapToInt(String::length)\n" +
                ".reduce(0, Integer::sum) = " +
                Arrays.stream(txt).filter(s -> s.length() > 3)
                    .mapToInt(String::length)
                    .reduce(0,(a, b) -> a+b)

        );
    }
}
