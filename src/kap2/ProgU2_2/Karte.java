package kap2.ProgU2_2;

public class Karte implements Comparable<Karte>{

    private final Farbe farbe;
    private final Wert wert;

    public Karte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    @Override
    public String toString() {
        return "{" + farbe + " " + wert +"}";
    }

    @Override
    public int compareTo(Karte k) {
        int ergebnis;

        ergebnis = (this.wert.ordinal()*10+ this.farbe.ordinal()) - (k.getWert().ordinal()*10+k.getFarbe().ordinal());

        return ergebnis;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Wert getWert() {
        return wert;
    }



}
