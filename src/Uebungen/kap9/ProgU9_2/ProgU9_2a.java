package Uebungen.kap9.ProgU9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgU9_2a {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int result = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Bitte " + (i+1) + ". Zahl eingeben");
            try {
                numbers[i] = Integer.parseInt(in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            System.out.print(numbers[i]);
            if (i< numbers.length-1)
                System.out.print(" + ");
        }
        System.out.println(" = " + result);

    }
}
