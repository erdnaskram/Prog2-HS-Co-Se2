package kap2.ProgU2_2;

public class Main {
    public static void main(String[] args) {
        Karte k = new Karte(Farbe.PIK,Wert.SIEBEN);

        System.out.printf("k" + k);

        Kartenspiel ks = new Kartenspiel(42);
        System.out.println(ks);

        ks.mischen();
        System.out.println(ks);

        ks.sort();
        System.out.println(ks);
    }
}
