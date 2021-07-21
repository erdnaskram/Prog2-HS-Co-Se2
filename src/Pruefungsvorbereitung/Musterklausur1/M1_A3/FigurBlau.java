package Pruefungsvorbereitung.Musterklausur1.M1_A3;

public class FigurBlau implements Brettfigur{
    @Override
    public String toString() {
        return "B";
    }

    @Override
    public int zug() {
        return +2;
    }
}
