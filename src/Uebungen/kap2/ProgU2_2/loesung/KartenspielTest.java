package Uebungen.kap2.ProgU2_2.loesung;

public class KartenspielTest {
	
	public static void main(String[] args) {
		
		Kartenspiel spiel = new Kartenspiel(32);
		System.out.println(spiel);
		spiel.sortieren();
		System.out.println(spiel);
		spiel.mischen();
		System.out.println(spiel);
		Kartenspiel spiel2 = new Kartenspiel(4);
		spiel.kartenspielHinzufuegen(spiel2);
		System.out.println(spiel);
		spiel.mischen();
		System.out.println(spiel);
	}

}
