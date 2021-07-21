package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A5;

public class Girokonto extends Konto {
		protected int maxUeberziehung;
		
		public Girokonto(int kontoStand, int maxUe) throws KontoException {
			super(kontoStand);
			if ((maxUe < 0) ||
				((kontoStand < 0) && (kontoStand  < - maxUe)))
				throw new KontoException();
			this.maxUeberziehung = maxUe; 
		}
		
		public Girokonto() {
			super();
		}
		
		public void auszahlen (int betrag) throws KontoException {
			if ((this.kontoStand - betrag ) < this.kontoStand - maxUeberziehung)
				throw new KontoException();
			else
				super.auszahlen(betrag);
		}
		
		public String toString() {
			return super.toString() + " " + maxUeberziehung;
		}
}
