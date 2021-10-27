package Uebungen.kap4.ProgU4_1;

public class Student {
    private static long nextId = 10000000L;
    private String vorname;
    private String nachname;
    private final int matrikelnummer;
    private String strassenname;
    private String hausnummer;
    private String ort;
    private int postleitzahl;

    private static long generiereMatrikelnummer(){
        return ++nextId;
    }

    public Student() {
        matrikelnummer = (int) generiereMatrikelnummer();
    }



    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStrassenname(String strassenname) {
        this.strassenname = strassenname;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
}
