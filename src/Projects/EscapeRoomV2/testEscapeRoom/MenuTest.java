package Projects.EscapeRoomV2.testEscapeRoom;

import Projects.EscapeRoomV2.InOut;
import Projects.EscapeRoomV2.menu;

public class MenuTest
{

    public static void main(String[] args)
    {
        // Array für die Anzahl der Rätsel und dessen Reihenfolge
        int[] ablauf =
        { 1, 2, 3 };

        menu myMenu = new menu();
        InOut Schnittstelle = new InOut(true);
        myMenu.setAblauf(ablauf);
        myMenu.auswahl(Schnittstelle);
        System.out.println("\nMenuTest ist fertig");
        System.out.println();
    }
}