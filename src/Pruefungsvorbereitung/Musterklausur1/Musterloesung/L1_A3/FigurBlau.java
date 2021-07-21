package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A3;

public class FigurBlau implements BrettFigur {
	
	Brett b;
	int x;
	int y;
	
	
	public FigurBlau(Brett b, int x, int y) {
		this.b = b;
		this.x = x;
		this.y = y;
	}
	
	public void ziehe(Richtung r) {
		
		int nachX = 0;
		
		if ((r == Richtung.North) && (x >1)) {
			nachX = x-2;
			b.bewege(this, x, y, nachX, y);
			x -=2;
		}
		if ((r == Richtung.South) && (x < 5)) {
			nachX = x+2;
			b.bewege(this, x, y, nachX, y);
			x +=2;
		}
		
	}
	
	public String toString() {
		return "B";
	}

}
