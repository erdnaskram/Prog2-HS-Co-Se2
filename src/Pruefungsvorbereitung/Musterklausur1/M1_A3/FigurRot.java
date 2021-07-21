package Pruefungsvorbereitung.Musterklausur1.M1_A3;

public class FigurRot implements Brettfigur{
    @Override
    public String toString() {
        return "R";
    }

    @Override
    public int zug() {
        return +2;
    }
}
