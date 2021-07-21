package Uebungen.kap6.ProgU6_2;


public class Jeans extends Kleidungsstueck {
	
	private static final String  typId="567407";
	protected int schrittlänge;

	
	public static String typNummer() {
		return typId;
	}
	
	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittlänge) {
		super(groesse,f,bezeichnung);
		this.schrittlänge = schrittlänge;
		artNr = typId + super.groesse;
	}
	
	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr +  " " + super.toString() + " " + schrittlänge;
	}
}
