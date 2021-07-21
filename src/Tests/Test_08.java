package Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test_08 {

    public static void main(String[] args) {
        Predicate<String> shortword = (s) -> s.length() < 4;
        List<String> sList = new ArrayList<>();
        sList.add("Hello");
        sList.add("lol");

        List<String> result = new ArrayList<>();

        for (String s : sList) {
            if (shortword.test(s)) {
                result.add(s);
            }
        }

        for (String s : result) {
            System.out.println("s = " + s);
        }




        List<Integer> wLengths = transformedList(sList, String::length);

        for (Integer wLength : wLengths) {
            System.out.println("wLength = " + wLength);
        }
    }

    public static <T,R> List<R> transformedList(List<T> startList, Function<T, R> function){
        List<R> result = new ArrayList<>();

        for (T s : startList) {
            result.add(function.apply(s));
        }
        return result;
    }
}
