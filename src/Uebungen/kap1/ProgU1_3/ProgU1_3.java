package Uebungen.kap1.ProgU1_3;

public class ProgU1_3 {
    public static void main(String[] args) {
        Zaehler z = new Zaehler();

        for (int i = 0; i < 7; i++) {
            try {
                z.erhoeheUmEins();
            } catch (EinerUeberlauf e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 8; i++) {
            try {
                z.erhoeheUmZehn();
            } catch (Ueberlauf e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 14; i++) {
            z.zaehlen();
        }
    }
}
