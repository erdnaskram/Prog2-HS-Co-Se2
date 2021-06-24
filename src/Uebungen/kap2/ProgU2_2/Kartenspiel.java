package Uebungen.kap2.ProgU2_2;

import java.util.Arrays;
import java.util.Random;

public class Kartenspiel {

    private Karte[] deck;

    public Kartenspiel (int n){
        Karte[] deck = new Karte[n];
        Random rn = new Random();
        Farbe[] farben = Farbe.values();
        Wert[] werte = Wert.values();
        for (int i = 0; i < n; i++) {
            Farbe farbe = farben[rn.nextInt(farben.length)];
            Wert wert = werte[rn.nextInt(werte.length)];
            deck[i] = new Karte(farbe ,wert);
        }
        this.deck=deck;
    }

    public void mischen(){
        Karte[] deck = new Karte[this.deck.length];
        boolean done;
        for (int i = 0; i < this.deck.length; i++) {
            done = false;
            do {
                int j = (int) (Math.random() * this.deck.length);
                if (deck[j]==null){
                    deck[j] = this.deck[i];
                    done = true;
                }
            } while (!done);
        }
        this.deck=deck;
    }

    public void sort() {
        Arrays.sort(this.deck);
    }

    @Override
    public String toString() {
        return "Kartenspiel{" +
                "deck=" + Arrays.toString(deck) +
                '}';
    }


}
