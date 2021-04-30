package kap4.ProgU4_2;

abstract class Fahrzeug {

    private double position;
    private double geschwindigkeit;
    private String name;
    private double maxGeschwindigkeit;
    private double beschleunigung;


    public double beschleunigen (double sekunden){
        //TODO implementieren
        return 0;
    }

    public double hoechstGeschwindigkeit(){
        return maxGeschwindigkeit;
    }

    public double fahren(double minuten){
        //TODO implementieren
        return 0;
    }
}
