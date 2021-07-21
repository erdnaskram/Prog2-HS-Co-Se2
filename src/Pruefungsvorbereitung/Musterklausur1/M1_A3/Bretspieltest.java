package Pruefungsvorbereitung.Musterklausur1.M1_A3;

public class Bretspieltest {

    public static void main(String[] args) {
        Brettfigur[][] spielbrett = new Brettfigur[8][8];


        for (int j = 0; j <= spielbrett[0].length - 1; j+=2) {
            spielbrett[0][j] = new FigurBlau();
        }
        for (int j = 1; j <= spielbrett[7].length - 1; j+=2) {
            spielbrett[7][j] = new FigurRot();
        }


        Brett brett = new Brett(spielbrett);
        brett.ziehen(0,0);
        brett.print();
    }
}
