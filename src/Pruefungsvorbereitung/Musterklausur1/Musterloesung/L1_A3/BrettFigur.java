package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A3;

public interface BrettFigur {
	enum Richtung { North, South };
	
	void ziehe(Richtung r);
}
