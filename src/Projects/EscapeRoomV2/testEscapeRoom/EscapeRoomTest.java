package Projects.EscapeRoomV2.testEscapeRoom;

import Projects.EscapeRoomV2.InOut;
import Projects.EscapeRoomV2.rooms.ProgOneRoom.EscapeRoom;



public class EscapeRoomTest
{
    public static void main(String[] args)
    {
        int[] raetselListe =
        { -1 };
        // eine Testschnittstelle erzeugen
        InOut TestSchnittstelle = new InOut(true);
        // Riddle testRiddle;

        System.out.println("--> erzeuge Objekt vom Typ EscapeRoom");
        EscapeRoom testEscapeRoom = new EscapeRoom("\"Starttext\"", raetselListe, TestSchnittstelle);


        System.out.println("--> starte \"testEscapeRoom.start();\"");
        testEscapeRoom.start();
        System.out.println("\n--> toString von EscapeRoom ausführen...");
        TestSchnittstelle.outPut(testEscapeRoom.toString());
        System.out.println("\n--> EscapeRoomTest ist fertig");
        System.exit(0);
    }
}
