package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A5;

public class Kreditkonto extends Konto {
	
	
	public Kreditkonto(int kreditSumme) throws KontoException {
		super(-kreditSumme);
		if (kreditSumme <= 0)
			throw new KontoException();
	}
	
	public void auszahlen (int betrag) throws KontoException {
		throw new KontoException();
	}
	
	public void einzahlen(int betrag) throws KontoException {
		if (betrag + this.kontoStand > 0) 
			throw new KontoException();
		super.einzahlen(betrag);
	}
	
	
}
