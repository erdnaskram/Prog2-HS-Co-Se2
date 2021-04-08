package Projects.EscapeRoom;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        abschlussPswd("10","2","3");
        Riddle r = new Riddle();
        while (true){
        String tese = r.raetsel1();
        int z2 = Integer.parseInt(tese);
        System.out.println("z2 = " + z2);
        }
    }

    public static void abschlussPswd(String lsg1, String lsg2, String lsg3){
        int z1 = Integer.parseInt(lsg1);
        int z2 = Integer.parseInt(lsg2);
        int z3 = Integer.parseInt(lsg3);
        Scanner sc = new Scanner(System.in);
        boolean geloest = false;

        int zG = z1 +z2 + z3;

        String finalPswd = Integer.toHexString(zG);

        //challenge 1

        System.out.println("Addiere folgende Zahlen zusammen und konvertiere sie in eine Hex Zahl! (a-f sind klein :) )");//-----------------

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);

        System.out.println("Ausgabe:");


        do {
            String antwort = sc.nextLine();
            if (antwort.equals(finalPswd)) {
                System.out.println("yes");
                geloest = true;
            } else {
                System.out.println("nice Try but wrong :) Try again!");
            }
        } while (!geloest);

        System.out.println("Glückwunsch- Tür offen- hau ab und gönn dir n Bier bevor dich noch ein verrückter Prof weg sperrt... ^^");
    }
}
