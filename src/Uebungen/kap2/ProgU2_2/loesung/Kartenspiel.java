package Uebungen.kap2.ProgU2_2.loesung;

import java.util.Arrays;

public class Kartenspiel {
	private Karte[] karten;

	public Kartenspiel(int n) {
		karten = new Karte[n];
		for (int i = 0; i < karten.length; i++) {

			int randomFarbe = (int) (Math.random() * Karte.Farbe.values().length);
			int randomWert = (int) (Math.random() * Karte.Wert.values().length);
			karten[i] = new Karte(Karte.Farbe.values()[randomFarbe], Karte.Wert.values()[randomWert]);
		}

	}

	public void mischen() {

		for (int i = 0; i < karten.length; i++) {

			// Wähle zufällig zwei Karten aus
			int ersterIndex = (int) (Math.random() * karten.length);
			int zweiterIndex = (int) (Math.random() * karten.length);

			// Vertausche diese beiden Karten
			Karte karte = karten[ersterIndex];
			karten[ersterIndex] = karten[zweiterIndex];
			karten[zweiterIndex] = karte;
		}

	}

	public void kartenspielHinzufuegen(Kartenspiel neu) {
		Karte[] original = this.karten;
		this.karten = new Karte[original.length + neu.karten.length];
		System.arraycopy(original, 0, karten, 0, original.length);
		System.arraycopy(neu.karten, 0, karten, original.length,
				neu.karten.length);

	}

	public void sortieren() {
		Arrays.sort(karten);

	}

	public String toString() {

		String s = "";
		for (Karte k : karten)
			s += k.toString() + " ";

		return s + "\n";
	}

}
