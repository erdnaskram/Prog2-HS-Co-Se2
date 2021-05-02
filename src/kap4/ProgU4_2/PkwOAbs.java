package kap4.ProgU4_2;

import static AdvancedMethods.AdvacedMath.pow;

public class PkwOAbs extends Pkw{

    public PkwOAbs(String name) {
        maxGeschwindigkeit = 38.8889;
        beschleunigung = 2.0;
        this.name = name;
    }

    public PkwOAbs(){
        maxGeschwindigkeit = 38.8889;
        beschleunigung = 2.0;
    }

    /**Definition Stoppen:
     * sa = (v/10)2 + (v/10)*3, wobei
     * v Geschwindigkeit m/sek
     * sa Anhalteweg in m
     * */
    @Override
    double stoppen() {
        return pow(geschwindigkeit/10,2) + (geschwindigkeit/10) * 3;
    }
}
