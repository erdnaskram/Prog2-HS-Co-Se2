package Uebungen.kap9.ProgU9_3;

import Uebungen.kap6.ProgU6_2.Artikel;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Artikelverwaltung {

    private LinkedList<Artikel> articles;


    public void write (String datName){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(datName))){
            for (Iterator<Artikel> it = articles.iterator(); it.hasNext();){
                bw.write(it.next().toString());
                if (it.hasNext()){
                    bw.append(",");
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load(String datName) {

        File file = new File(datName);
        String[] input = new String[0];

        if (!file.canRead() || !file.isFile())
            System.exit(0);

        try(BufferedReader br = new BufferedReader(new FileReader(datName))){
            input = br.lines().toArray(String[]::new);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Consumer<String> consumer = System.out::println;
        Arrays.stream(input).forEach(consumer);
    }
}
