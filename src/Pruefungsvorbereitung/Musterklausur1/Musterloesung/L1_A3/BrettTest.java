package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A3;

public class BrettTest {
	
	public static void main(String[] args) {
		
		Brett b = new Brett();
		b.print();
		b.ziehen(BrettFigur.Richtung.North);
		b.ziehen(BrettFigur.Richtung.South);
	
	}

}
