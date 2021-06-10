package kap8.ProgU8_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Ted", "Neward", 41),
                new Person("Charlotte", "Neward", 41),
                new Person("Michael", "Neward", 19),
                new Person("Matthew", "Neward", 13),
                new Person("Adam", "Pfeiffer", 43)
        };

        //Var1
        Collection<Person> coll = new ArrayList<>((Arrays.asList(people)));
        coll = coll.stream().sorted((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName())).collect(Collectors.toList());


        //Var2
        Comparator<Person> cf = Person::compareFirstName;

        Arrays.sort(people, cf);


        //Var3
        Arrays.sort(people, Comparator.comparing(Person::getFirstName));



        //Var4






    }
}
