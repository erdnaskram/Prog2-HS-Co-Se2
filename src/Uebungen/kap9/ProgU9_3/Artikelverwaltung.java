package Uebungen.kap9.ProgU9_3;

import Uebungen.kap6.ProgU6_2.Artikel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

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
}
