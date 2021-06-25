package Uebungen.kap9.ProgU9_3;

import Uebungen.kap6.ProgU6_2.Artikel;
import Uebungen.kap6.ProgU6_2.Jeans;
import Uebungen.kap6.ProgU6_2.Kleidungsstueck;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class ArtikelverwaltungsTest {

    public static void main(String[] args) {
        String dateiName = "/Users/ap7w0/git/Java/Prog2-HS-Co-Se2/src/Uebungen/kap9/ProgU9_3/Artikel.txt";
//        scanneDatei(dateiName);
//        ladeDatei(dateiName);
        LinkedList<Artikel> articles = new LinkedList<>();
        Jeans j = new Jeans(38, Kleidungsstueck.Farbe.GRAU, "Levis", 440);
        articles.add(j);
        write(dateiName, articles);

    }

    public static void write (String datName, LinkedList<Artikel> articles){
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

    private static void ladeDatei(String datName) {

        File file = new File(datName);

        if (!file.canRead() || !file.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(datName));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.println("Gelesene Zeile: " + zeile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }
    }

    private static void ladeDatei2(String datName) {

        File file = new File(datName);

        if (!file.canRead() || !file.isFile())
            System.exit(0);

        try(BufferedReader br = new BufferedReader(new FileReader(datName))){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> scanneDatei(String dateiName){
        Scanner scan = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            scan = new Scanner(new File(dateiName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scan.hasNext()) {
            String input = scan.nextLine();
            System.out.println(input);
            list.add(input);
        }
        scan.close();
        return list;
    }
}
