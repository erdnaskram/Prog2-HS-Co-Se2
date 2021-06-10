package kap8.ProgU8_4;

import Vorlesungen.codebeispiele.predicatesexample.Employee;
import Vorlesungen.codebeispiele.predicatesexample.EmployeeAdministration;

import java.util.Arrays;
import java.util.function.Predicate;

public class EmployeeAdministrationTest {

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    public static Predicate<Employee> isAgeLessThan(Integer age) {
        return isAgeMoreThan(age).negate();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
        Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
        Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
        Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
        Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
        Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
        Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
        Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
        Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
        Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");

        EmployeeAdministration employees = new EmployeeAdministration(
                Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8,
                        e9, e10));

        //The predicates

        Predicate<Employee> isAgeMoreThan18 = isAgeMoreThan(18);
        Predicate<Employee> isMale = employee -> employee.getGender().equals("M");
        Predicate<Employee> isFemale = employee -> employee.getGender().equals("F");
        Predicate<Employee> isAdultMale = isMale.and(isAgeMoreThan18);
        Predicate<Employee> firstNameDavid = employee -> employee.getFirstName().equals("David");

        //...


        //The out filter output

        System.out.println("\n---- all employees > age 18----");
        System.out.println(employees.filter(isAgeMoreThan18));

        System.out.println("\n---- all employees male----");
        System.out.println(employees.filter(isMale));

        System.out.println("\n---- all employees female----");
        System.out.println(employees.filter(isFemale));

        System.out.println("\n---- all employees AdultMale----");
        System.out.println(employees.filter(isAdultMale));

        System.out.println("\n---- all employees David firstName----");
        System.out.println(employees.filter(firstNameDavid));

        System.out.println("\n---- all employees <= age 35----");
        System.out.println(employees.filter(isAgeLessThan(35)));

        System.out.println("\n---- all employees AdultMale or female----");
        System.out.println(employees.filter(isAdultMale.or(isFemale)));

        //...
    }

}
