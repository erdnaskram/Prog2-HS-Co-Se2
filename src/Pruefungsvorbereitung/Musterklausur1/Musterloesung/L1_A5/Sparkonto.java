package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A5;

public class Sparkonto extends Konto {
	
	public Sparkonto(int kontoStand)throws KontoException  {
		super(kontoStand);
		if (kontoStand <= 0 )
			throw new KontoException();
	}
	
	
	
	public void auszahlen (int betrag) throws KontoException {
		if ((this.kontoStand - betrag ) > 0)
			super.auszahlen(betrag);
		else
			throw new KontoException();
	}
	
}
