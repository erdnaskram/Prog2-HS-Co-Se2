package kap4.ProgU4_2;

import static AdvancedMethods.AdvacedMath.pow;

abstract class Fahrzeug {

    double position;
    double geschwindigkeit;
    String name;
    static double maxGeschwindigkeit;
    static double beschleunigung;


    public double beschleunigen (double sekunden){
        if (maxGeschwindigkeit <= beschleunigung * sekunden){
            double beschleunigungsZeit = maxGeschwindigkeit / beschleunigung;
            position = 0.5 * beschleunigung * pow(beschleunigungsZeit, 2);
            geschwindigkeit = maxGeschwindigkeit;
            fahren((sekunden-maxGeschwindigkeit)/60);
        } else {
            position = 0.5 * beschleunigung * pow(sekunden, 2);
            geschwindigkeit = beschleunigung * sekunden;
        }
        return position;
    }

    public double hoechstGeschwindigkeit(){
        return maxGeschwindigkeit;
    }

    public double fahren(double minuten){
        position += geschwindigkeit * minuten * 60;
        return position;
    }

    abstract double stoppen();
}
