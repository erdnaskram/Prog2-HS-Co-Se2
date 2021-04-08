package Projects.EscapeRoom;

import java.util.Random;
import java.util.Scanner;

public class Riddle {

    public Riddle() {

    }

    public String raetsel2(){
        /**Erweiterungsvorschlag:
         * statt double ein random Datentyp der abgefragt wird, bzw anzeige aller Datentypen in Tabelle,
         * bei einem fehlen die Bytes*/
        String loesung = "42";
        Scanner sc = new Scanner(System.in);
        boolean geloest = false;


        System.out.println("Ansage neues rätsel");

        System.out.println( "\n+------------------------------------------+\n" +
                            "| if(++b != a)                             |\n" +
                            "| System.out.println(\"8\");                 |\n" +
                            "| else if((c - a) == ++b)                  |\n" +
                            "|    System.out.println(\"14\");             |\n" +
                            "| else if((a-- == b) && (a + b == 9))      |\n" +
                            "|    System.out.println(\"10\");             |\n" +
                            "| else                                     |\n" +
                            "|    System.out.println(\"42\");             |\n" +
                            "+------------------------------------------+\n");


        System.out.println("was is die antwort auf das alles?");
        do {
            String antwort = sc.nextLine();
            if (antwort.equals(loesung)) {
                System.out.println("yes");
                geloest = true;
            } else {
                System.out.println("nice Try but wrong :) Try again!");
            }
        } while (!geloest);

        return loesung;
    }

    public String raetsel1(){
        String[] groese = {"08","08","16","16","32","32","64","64"};
        String[] typen ={"boolean", "byte","short","char","int","float","long","double"};
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        boolean geloest = false;

        int lsgNummer = rn.nextInt(groese.length-1);
        String gesucht = typen[lsgNummer];
        String loesung = groese[lsgNummer];
        groese[lsgNummer] = "XX";


        System.out.println("CCC: Ansage neues rätsel");

        System.out.println( "\n+-------------------+\n" +
                "| short      " + groese[2] + " bit |\n" +
                "| long       " + groese[6] + " bit |\n" +
                "| byte       " + groese[1] + " bit |\n" +
                "| double     " + groese[7] + " bit |\n" +
                "| flaot      " + groese[5] + " bit |\n" +
                "| boolean    " + groese[0] + " bit |\n" +
                "| char       " + groese[3] + " bit |\n" +
                "| int        " + groese[4] + " bit |\n" +
                            "+-------------------+\n");

        System.out.println("CCC: wie vie bytes hat " + gesucht + "?\n");



        do {
            String antwort = sc.nextLine();
            if (antwort.equals(loesung)) {
                System.out.println("CCC: yes");
                geloest = true;
            } else {
                System.out.println("CCC: nice Try but wrong :) Try again!");
            }
        } while (!geloest);

        return loesung;
    }



    public String raetsel3(){//Zahlenkonvertierung
        String[] orginal = {"byte","short","int","long","float","double"};
        String[] raetsel = new String[6];
        String loesung = null;
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        boolean geloest = false;

        for (int i = 0; i < 6; i++) {
            int pos;
            if (i == 0) {
                pos = rn.nextInt(6);
                raetsel[pos] = orginal[i];
                loesung = String.valueOf(pos);
            }else{
                do {
                    pos = rn.nextInt(6);
                } while (raetsel[pos] != null);
                raetsel[pos] = orginal[i];;
                loesung = loesung + pos;
            }

        }


        System.out.println("2 von (CounterRätselAnzahlGesamt)3 benötigten Zahlen haben Sie schon einmal gefunden.\n" +
                "Als nächstes öffnen Sie die Schränke des Labors und finden dabei ein SteckPuzzel.");

        for (int i = 0; i < 6; i++) {
            System.out.println(raetsel[i] + ": \t" + i);
        }

        System.out.println("Dabei fällt Ihnen als erfahrener Programmierer sofort auf, dass die Anordnung nicht korrekt ist!\n" +
                "Wie ist die richtige Typkonvertierung von fundamentalen Datentypen anzuordnen?\n");

        do {
            String antwort = sc.nextLine();
            if (antwort.equals(loesung)) {
                System.out.println("yes");
                geloest = true;
            } else {
                System.out.println("nice Try but wrong :) Try again!");
            }
        } while (!geloest);

        return loesung;
    }



}
