package Pruefungsvorbereitung.Musterklausur1.M1_A5;

public class Kreditkonto extends Konto{

    public Kreditkonto(float kreditSumme) throws KontoException {
        super(- kreditSumme);

        if (kreditSumme <= 0)
            throw new KontoException();
    }

}
