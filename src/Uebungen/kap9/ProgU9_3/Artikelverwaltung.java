package Uebungen.kap9.ProgU9_3;

import Uebungen.kap6.ProgU6_2.Artikel;
import Uebungen.kap6.ProgU6_2.Jeans;
import Uebungen.kap6.ProgU6_2.Kleidungsstueck;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

import static Uebungen.kap6.ProgU6_2.Kleidungsstueck.Farbe.*;

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void load(String datName) {

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
        Arrays.stream(input).forEach((String elem) ->
        {
            if (elem.contains("567407")) {
                elem = elem.replace(",","");
                String[] art = elem.split(" ");
                Jeans jeans = new Jeans(Integer.parseInt(art[2]), parseColor(art[3]), art[1], Integer.parseInt(art[4]));
                System.out.println("jeans = " + jeans);
            }
        });
    }

    private static Kleidungsstueck.Farbe parseColor(String col){
        switch (col.toLowerCase()) {
            case "grau":
                return GRAU;
            case "grün":
                return GRÜN;
            case "rot":
                return ROT;
            case "schwarz":
                return SCHWARZ;
            default:
                return null;
        }
    }
}
