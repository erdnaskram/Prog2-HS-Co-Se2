package Pruefungsvorbereitung.Musterklausur1.M1_A5;

public class Kreditkonto extends Konto{

    public Kreditkonto(float kreditSumme) throws KontoException {
        super(- kreditSumme);
        if (kreditSumme <= 0)
            throw new KontoException("Kreditsumme muss größer als Null sein!");
    }

    @Override
    public float einzahlen(float betrag) throws KontoException {
        if (this.kontostand + betrag <= 0)
            return super.einzahlen(betrag);
        else
            throw  new KontoException("Kreditkontostand darf nicht größer Null werden!");
    }


    @Override
    public float auszahlen(float betrag) throws KontoException {
        throw new KontoException("Von einem Kreditkonto kann kein Geld abgehoben werden!");
    }
}
