package Tests.Lambdas.Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static Tests.Lambdas.Predicates.Person.Geschlecht.*;

public class PersonTest {
    public static void main(String[] args) {
        Person klaus = new Person(21, MAENNLICH);
        Person franzi = new Person(18, WEIBLICH);
        Person sascha = new Person(17, DIVERS);
        Person lara = new Person(15, WEIBLICH);

        List<Person> list = new ArrayList<>();
        list.add(klaus);
        list.add(franzi);
        list.add(sascha);
        list.add(lara);


        Predicate<Person> istVolljaerig = p -> p.getAlter() >= 18;
        for (Person person : list) {
            System.out.println("istVolljaerig.test() = " + istVolljaerig.test(person));
        }

        Predicate<Person> istWeiblich = p -> p.getGeschlecht() == WEIBLICH;
        Predicate<Person> istDivers = p -> p.getGeschlecht() == DIVERS;
        for (Person person : list) {
            System.out.println("istWeiblich.test() = " + istWeiblich.test(person));
        }

        Predicate<Person> istVolljaerigUndWeiblich = istVolljaerig.and(istWeiblich);
        Predicate<Person> istVolljaerigUndWeiblich2 = ((Predicate<Person>)p -> p.getAlter() >= 18).and(p -> p.getGeschlecht() == WEIBLICH);

        System.out.println("istVolljaerigUndWeiblich.test(franzi) = " + istVolljaerigUndWeiblich.test(franzi));
        System.out.println("istVolljaerigUndWeiblich.test(lara) = " + istVolljaerigUndWeiblich.test(lara));

        Predicate<Person> istWeiblichOderDivers = istWeiblich.or(istDivers);

    }
}
