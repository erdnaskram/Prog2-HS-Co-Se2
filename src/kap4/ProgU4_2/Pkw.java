package kap4.ProgU4_2;

import static AdvancedMethods.AdvacedMath.pow;

public class Pkw extends Fahrzeug{

    public Pkw(String name) {
        maxGeschwindigkeit = 44.4444;
        beschleunigung = 2.0;
        this.name =name;
    }

    public Pkw() {
        maxGeschwindigkeit = 44.4444;
        beschleunigung = 2.0;
    }

    /**Definition Stoppen:
     * sa = ½ * (v/10)2 + (v/10)*3, wobei
     * v Geschwindigkeit m/sek
     * sa Anhalteweg in m
     * */
    @Override
    double stoppen() {
        return 0.5 * pow(geschwindigkeit/10,2) + (geschwindigkeit/10) * 3;
    }
}
