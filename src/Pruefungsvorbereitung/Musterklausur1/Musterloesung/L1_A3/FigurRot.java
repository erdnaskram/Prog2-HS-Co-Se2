package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A3;

public class FigurRot implements BrettFigur{
	Brett b;
	int x;
	int y;
	
	
	public FigurRot(Brett b, int x, int y) {
		this.b = b;
		this.x = x;
		this.y = y;
	}
	
	public void ziehe(Richtung r) {
		
		int nachX = 0;
		
		if ((r == Richtung.North) && (x >0 )) {
			nachX = x-1;
			b.bewege(this, x, y, nachX, y);
			x -=1;
		}
		if ((r == Richtung.South) && (x < 7)) {
			nachX = x+1;
			b.bewege(this, x, y, nachX, y);
			x +=1;
		}
		
	}
	public String toString() {
		return "R";
	}


}
