package Uebungen.kap2.ProgU2_2.loesung;

public class Karte implements Comparable<Karte> {
	
	enum Farbe { KARO, HERZ, PIK, KREUZ};
	enum Wert  { SIEBEN, ACHT, NEUN, ZEHN,  BUBE, DAME, KOENIG, ASS };
	
	private Farbe 	farbe;
	private Wert	wert;
	
	
	public Karte (Farbe f, Wert w) {
		farbe = f;
		wert = w;
	}
	
	public String toString() {
		return farbe.toString() + wert.toString();
	}
	
	public int compareTo(Karte k) {
		
		if (k.farbe.equals(this.farbe)) return 0;
		
		if (k.farbe.ordinal() < this.farbe.ordinal()) return 1;
		if (k.farbe.ordinal() > this.farbe.ordinal()) return -1;
		
		return 0;
	}
	
	

}
