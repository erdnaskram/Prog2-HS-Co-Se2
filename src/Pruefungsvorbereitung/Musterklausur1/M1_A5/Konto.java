package Pruefungsvorbereitung.Musterklausur1.M1_A5;

public class Konto {

    private final long kontonummer;
    private float kontostand;
    public float oldKontostand;

    private static long NextId = 10000000L;

    private static long generiereKontonummer(){
        return ++NextId;
    }

    public Konto() {
        kontonummer = generiereKontonummer();
    }

    public Konto(float stand) {
        kontonummer = generiereKontonummer();
    }

    public float einzahlen(float betrag) throws KontoException {
        if (betrag <= 0) throw new KontoException();
        oldKontostand = kontostand;
        kontostand += betrag;
        return kontostand;
    }

    public float auszahlen(float betrag) throws KontoException {
        if (betrag <= 0) throw new KontoException();
        oldKontostand = kontostand;
        kontostand -= betrag;
        return kontostand;
    }

    public void undoLastOperation() {
        kontostand = oldKontostand;
    }

    public long getKontonummer() {
        return kontonummer;
    }

    public float getKontostand() {
        return kontostand;
    }

    public String toString() {
        return getClass() + " " + getKontonummer() + ": " + getKontostand();
    }
}
