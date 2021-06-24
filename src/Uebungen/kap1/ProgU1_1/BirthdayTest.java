package Uebungen.kap1.ProgU1_1;

import java.util.Scanner;

public class BirthdayTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        Birthday yourbday = null;

        do {
            System.out.println("Geben sie einen Geburtstag ein:");
            input = sc.next();

            try {
                yourbday = new Birthday(input);
            } catch (InvalidBirthdayException e) {
                System.out.println(e.getMessage());
            }
        }while (yourbday == null);

        System.out.println(yourbday.getTheDay());
    }
}
