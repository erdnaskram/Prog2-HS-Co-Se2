package Pruefungsvorbereitung.Musterklausur1.M1_A5;

public class Girokonto extends Konto{
    protected float maxUeberziehung;

    public Girokonto(){
        super();
    }

    public Girokonto(int kontostand, int maxUe) throws KontoException{
        super(kontostand);
        if (maxUe < 0)
            throw new KontoException("Die der Überziehungswert muss positiv sein!");
        if (kontostand < - maxUe )
            throw new KontoException("Der Initiale Girokontostand darf die Überziehung nicht überschreiten!");
        this.maxUeberziehung = maxUe;
    }

    @Override
    public float auszahlen(float betrag) throws KontoException {
        if (kontostand - betrag < -maxUeberziehung)
            throw new KontoException("Die maximale Überziehung des Girokontos darf nicht überschritten werden!");
        else
            return super.auszahlen(betrag);
    }

    @Override
    public String toString() {
        return super.toString() + ", MaxÜberziehung: " + maxUeberziehung;
    }
}
