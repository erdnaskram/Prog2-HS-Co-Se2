package Uebungen.kap4.ProgU4_2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Fahrzeugsimulation {

    public static void main(String[] args) {
        NumberFormat pos = NumberFormat.getInstance(new Locale("sk", "SK"));
        pos.setMinimumFractionDigits(2);
        pos.setMaximumFractionDigits(2);
        NumberFormat ges = NumberFormat.getInstance(new Locale("sk", "SK"));
        ges.setMinimumFractionDigits(2);
        ges.setMaximumFractionDigits(2);

        Pkw pkw = new Pkw("PKW 1");
        LKW lkw1 = new LKW("LKW 1",4.5);
        LKW lkw2 = new LKW("LKW 2",3);
        PkwOAbs pkwOAbs = new PkwOAbs("PKW 2");

        List<Fahrzeug> Fahrzeuge = new ArrayList<>();

        Fahrzeuge.add(pkw);
        Fahrzeuge.add(lkw1);
        Fahrzeuge.add(lkw2);
        Fahrzeuge.add(pkwOAbs);

        for (Fahrzeug fahrzeug : Fahrzeuge) {
            if (fahrzeug.getClass() == LKW.class) {
                fahrzeug.beschleunigen(30);
                System.out.println(fahrzeug.name + "\tPosition: " +
                        pos.format(fahrzeug.fahren(0.5) / 1000) + "km\tGeschwindigkeit: " +
                        ges.format(fahrzeug.geschwindigkeit * 3.6) + "km/h");
            } else {
                fahrzeug.beschleunigen(15);
                System.out.println(fahrzeug.name + "\tPosition: " +
                        pos.format(fahrzeug.fahren(0.75) / 1000) + "km\tGeschwindigkeit: " +
                        ges.format(fahrzeug.geschwindigkeit * 3.6) + "km/h");
            }
        }

        System.out.println("\n\n20 Minuten später:");

        for (Fahrzeug fahrzeug : Fahrzeuge) {
            if (fahrzeug.getClass() == LKW.class) {
                System.out.println("Position " + fahrzeug.name + ": " +
                        pos.format(fahrzeug.fahren(20) / 1000) + "km");
            } else {
                System.out.println("Position " + fahrzeug.name + ": " +
                        pos.format(fahrzeug.fahren(20) / 1000) + "km");
            }
        }

    }
}
