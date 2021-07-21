package Pruefungsvorbereitung.Musterklausur1.M1_A5;

public class Sparkonto extends Konto{

    public Sparkonto(float stand) throws KontoException {
        super(stand); //TODO Warum muss es vor das "if"?
        if (stand <= 0)
            throw new KontoException("Sparkontostand muss größer Null sein!");

    }


    @Override //TODO es müsste doch überall "@Override" stehen oder?
    public float auszahlen(float betrag) throws KontoException {
        if (this.kontostand - betrag > 0) //TODO muss da wirklich "this" hin?
            return super.auszahlen(betrag);
        else
            throw new KontoException("Sparkontostand muss größer Null bleiben!");
    }
}
