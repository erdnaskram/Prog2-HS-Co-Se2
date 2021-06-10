package kap8.ProgU8_5;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;
    }

    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName
                + ", age=" + age + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    public static int compareFirstName(Person lhs, Person rhs){
        return lhs.getFirstName().compareTo(rhs.getFirstName());
    }
}