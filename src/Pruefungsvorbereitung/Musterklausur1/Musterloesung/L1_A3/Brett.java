package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A3;

public class Brett {
	private BrettFigur[][] spielBrett;
	
	public Brett() { 
		spielBrett = new BrettFigur[8][8];
		for (int i = 0; i < 8; i+= 2)
			spielBrett[0][i] =  new FigurBlau(this,0,i); 
		
		for (int i = 1; i < 8; i+= 2)
			spielBrett[7][i] =  new FigurRot(this,7,i); 
	}
	
	void bewege(BrettFigur f, int vonX, int vonY, int nachX, int nachY) {
		BrettFigur ff = f;
		spielBrett[vonX][vonY] = null;
		spielBrett[nachX][nachY] = ff;
	}
	
	public String toString() {
		String out="";
		for (int i = 0; i < 8;i++) {
			for (int j = 0; j < 8;j++) {
				if (spielBrett[i][j] != null) 
					out += spielBrett[i][j].toString();
				else 
					out += "x";
			}
			out += "\n";
		}
				
		return out;
	}
	
	public void ziehen(BrettFigur.Richtung r) {
		
		if (r == BrettFigur.Richtung.South) {

			for (int i = 0; i < 8; i++) {
			
				for (int j = 0; j < 8; j++) {
					if (spielBrett[i][j] != null)
						spielBrett[i][j].ziehe(BrettFigur.Richtung.South);

				}
				this.print();

			}
		}
		if (r == BrettFigur.Richtung.North) {

			for (int i = 7; i >= 0; i--) {
				for (int j = 0; j < 8; j++) {
					if (spielBrett[i][j] != null)
						spielBrett[i][j].ziehe(BrettFigur.Richtung.North);

				}
				this.print();
			}
		}

		
				
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
