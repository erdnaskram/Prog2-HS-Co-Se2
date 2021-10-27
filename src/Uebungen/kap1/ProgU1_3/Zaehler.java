package Uebungen.kap1.ProgU1_3;

public class Zaehler {
    private int einer = 0;
    private int zehner = 0;

    public void erhoeheUmEins() throws EinerUeberlauf {
        if (einer == 9)
            throw new EinerUeberlauf();
        einer++;
        System.out.println("Einer: " + einer);
    }

    public void erhoeheUmZehn() throws Ueberlauf {
        if (zehner == 9)
            throw new Ueberlauf();
        zehner++;
        System.out.println("Zehner: " + zehner);
    }

    public void zaehlen(){
        try {
            erhoeheUmEins();
        } catch (EinerUeberlauf e){
            try {
                erhoeheUmZehn();
                einer = 0;
            } catch (Ueberlauf ex) {
                System.out.println("Fehler aufgetreten: Ueberlauf!");
            }
        }
    }

}
