package Pruefungsvorbereitung.Musterklausur1.M1_A5;

public class Konto {

    protected final long kontonummer;
    protected float kontostand;
    protected float oldKontostand;

    private static long nextId = 1000000L;

    private static long generiereKontonummer(){
        return ++nextId;
    }

    public Konto() {
        kontonummer = generiereKontonummer();
    }

    public Konto(float stand) {
        kontonummer = generiereKontonummer();//TODO warum hier kein "this" aber bei den unteren? WEIL SCHEIß EGAL IS :)
        this.kontostand = stand;
        this.oldKontostand = 0;
    }

    public float einzahlen(float betrag) throws KontoException {
        if (betrag <= 0)
            throw new KontoException("Der Einzahlungsbetrag muss positiv sein!");
        oldKontostand = kontostand;
        kontostand += betrag;
        return kontostand;
    }

    public float auszahlen(float betrag) throws KontoException {
        if (betrag <= 0)
            throw new KontoException("Der Auszahlungsbetrag muss positiv sein!");
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
        return getClass().getSimpleName() + " " + getKontonummer() + ": " + getKontostand();
    }
}
