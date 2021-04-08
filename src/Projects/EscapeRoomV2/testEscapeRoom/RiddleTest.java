package Projects.EscapeRoomV2.testEscapeRoom;

import Projects.EscapeRoomV2.InOut;
import Projects.EscapeRoomV2.rooms.ProgOneRoom.Riddle;

public class RiddleTest
{
    private RiddleTest()
    {
    }

    public static void main(String[] args)
    {
        System.out.println("\"Ein Objekt vom Typ InOut und ein Objekt vom Typ Riddle erzeugen");
        InOut testSchnittstelle = new InOut(true);
        Riddle testRiddle = new Riddle(testSchnittstelle, 3);
        System.out.println("\"Die einzelnen Level starten und den Rückgabewert ausgeben\"");
        System.out.println(testRiddle.raetselSuche(1));
        System.out.println(testRiddle.raetselSuche(2));
        System.out.println(testRiddle.raetselSuche(3));
        System.out.println(testRiddle.raetselSuche(-42));
        System.out.println("\nRiddleTest ist fertig");
    }
}
