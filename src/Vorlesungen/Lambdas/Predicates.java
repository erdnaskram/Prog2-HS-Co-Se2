package Vorlesungen.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Michael");
        names.add("Tim");
        names.add("Florian");
        names.add("Jule");
        names.add("Elke");
        names.add("Tom");
        names.add("Fiffi");
        names.add("Flo");
        names.add("Biggi");
        names.add("Flo");
        names.add("Clemens");

        Predicate<String> shortWords = s -> s.length() < 4;
        Predicate<Integer> p = i -> i<4;

        long n11 = names.stream().map(s -> {
            return s.length();
        }).filter(p).count();
        System.out.println("n11= " + n11);

        long n12 = names.stream().map(s -> s.length()).filter(p).count();
        System.out.println("n12= " + n12);

        long n13 = names.stream().map(String::length).filter(p).count();
        System.out.println("n13= " + n13);



        long n2 = names.stream().filter(shortWords).count();
        System.out.println("n2 = " + n2);


    }
}
