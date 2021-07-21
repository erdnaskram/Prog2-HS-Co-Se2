package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A2;

public class Adress {
	private String strassenName, ort;
	private int plz;
	
	public Adress(String s,  int plz, String o) {
		this.ort = o;
		this.plz = plz;
		this.strassenName = s;
	}
	public String getOrt() {
		return ort;
	}
	public int getPlz() {
		return plz;
	}
	public String getStrassenName() {
		return strassenName;
	}

}
