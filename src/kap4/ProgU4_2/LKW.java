package kap4.ProgU4_2;

import static AdvancedMethods.AdvacedMath.pow;

public class LKW extends Fahrzeug{

    private boolean beladen;
    private double beladung = 0;
    private double maxBeladung;

    public LKW(String name, double maxBeldadung){
        maxGeschwindigkeit = 29.1667;
        beschleunigung = 0.5;
        this.maxBeladung = maxBeladung;
        this.name = name;
    }

    public void beladen(double ladungInTonnen){
        beladung += ladungInTonnen;
    }

    public void entladen(double ladungInTonnen){
        beladung -= ladungInTonnen;
    }

    boolean istVollBeladen(){
        return beladung >= maxBeladung;
    }

    /**Definition Stoppen:
     * sa = ½ * (v)2 / a+ (v/10)*3, wobei
     * v Geschwindigkeit m/sek
     * sa Anhalteweg in m
     * a Bremsverzögerung m/sek2
     * Wenn der LKW voll beladen ist, ist a = 3.0 m/sek2,
     * Wenn der Lkw nicht voll beladen ist, ist a = 5.0 m/sek2
     * */
    @Override
    double stoppen() {
        if(istVollBeladen()) {
            return 0.5 * pow(geschwindigkeit, 2) / 3.0 + (geschwindigkeit / 10) * 3;
        } else {
            return 0.5 * pow(geschwindigkeit, 2) / 5.0 + (geschwindigkeit / 10) * 3;
        }
    }
}
