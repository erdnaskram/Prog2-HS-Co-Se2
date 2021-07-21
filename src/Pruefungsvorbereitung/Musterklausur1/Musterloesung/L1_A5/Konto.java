package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A5;

public class Konto {

		protected long kontoNummer;
		protected int kontoStand;
		protected int oldKontoStand;
		
		private static long nextId = 10000000;
		
		private static long generiereKontonummer() {
			return ++nextId;
		}
		
		public Konto() {
			kontoNummer = generiereKontonummer();
		}
		
		public Konto(int stand) {
			kontoNummer = generiereKontonummer();
			this.kontoStand = stand;
			this.oldKontoStand = 0;
		}
		
		public void undoLastOperation() {
			kontoStand = oldKontoStand;
		
		}
		public void auszahlen(int betrag)  throws KontoException {
			if (betrag < 0) throw new KontoException();
			oldKontoStand = kontoStand;
			kontoStand -= betrag;
		}
		public void einzahlen(int betrag) throws KontoException {
			if (betrag < 0) throw new KontoException();
			oldKontoStand = kontoStand;
			kontoStand += betrag;
		}
		
		public String toString() {
			return "" + kontoNummer + " " + kontoStand;
		}
		public long getKontoNummer() {
			return kontoNummer;
		}
		public int getKontoStand() {
			return kontoStand;
		}
		
		
		
		
}
