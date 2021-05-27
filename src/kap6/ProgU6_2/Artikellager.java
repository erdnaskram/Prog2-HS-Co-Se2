package kap6.ProgU6_2;

import kap6.ProgU6_1.Ort;

import java.util.Arrays;

public class Artikellager<E extends Artikel> {

    Ort<E>[] orte;

    public Artikellager(int anzahlOrte) {
        orte = new Ort[anzahlOrte];
        for (int i = 0; i < orte.length; i++)
            orte[i] = new Ort<E>(i);
    }

    public E auslagern(String artikelnummer){
        Artikel gesucht;
        for (Ort<E> eOrt : orte) {
            if (eOrt.istBelegt()){
                gesucht = eOrt.getEingelagertesElement();
                if (gesucht.artikelNummer().equals(artikelnummer)) {
                    return eOrt.entnehmen();
                } else {
                    gesucht = null;
                }
            }
        }
        return null;
    }

    public boolean einlagern(E e){
        int i = 0;
        boolean sucess = false;
        do {
            if (!orte[i].istBelegt()) {
                orte[i].hinzufügen(e);
                sucess = true;
            }
            i++;
        } while (!sucess && i <= orte.length);
        return sucess;
    }

    public int bestandSuchen(String artikelnummer){
        int zaeler = 0;

        for (Ort<E> eOrt : orte) {
            if (eOrt.getEingelagertesElement().artikelNummer().equals(artikelnummer)) {
                zaeler++;
            }
        }

        return zaeler;
    }

    @Override
    public String toString() {
        String ret = "";
        for (Ort<E> eOrt : orte) {
            ret = ret + "Lagerort: " + eOrt.getOrtsId() + "Artikel: " + eOrt.getEingelagertesElement().toString() + "\n";
        }
        return ret;
    }
}
