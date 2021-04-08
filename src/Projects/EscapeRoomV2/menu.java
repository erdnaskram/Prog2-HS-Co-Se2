package Projects.EscapeRoomV2;

import Projects.EscapeRoomV2.rooms.ProgOneRoom.GlobalData;
import Projects.EscapeRoomV2.rooms.ProgOneRoom.Texte;

public class menu
{
    private Game myGame;
    // Array für die Anzahl der Rätsel und dessen Reihenfolge
    private int[] ablauf =
    { 1, 2, 3 };

    public static void main(String[] args)
    {
        menu myMenu = new menu();
        // die Referenz des erzeugten Objektes "schnittstelle"
        // wird an alle weiteren erzeugten Objekten übergeben
        InOut schnittstelle = new InOut();
        schnittstelle.clearCons();
        myMenu.auswahl(schnittstelle);
    }

    // diese rekursive Methode bildet das Menü ab
    public void auswahl(InOut Schnittstelle)
    {
        String switchNumber;

        Schnittstelle.outPut(Texte.getMenuText());

        switchNumber = Schnittstelle.inPut();
        Schnittstelle.clearCons();
        //Menuführung anhand Switch-Case
        //Option 1 bis 4
        switch (switchNumber)
        {
        case "1":
            GlobalData.isMenuAktiv = false;
            Schnittstelle.clearCons();
            myGame = new Game(Schnittstelle, ablauf);
            myGame.Start();
            if (Schnittstelle.getIsTest() == false)
            {
                GlobalData.isMenuAktiv = true;
            }
            break;
        case "2":
            Schnittstelle.clearCons();
            Schnittstelle.outPut(Texte.getFehler404());
            Schnittstelle.outPut(Texte.zurueckZumMenue());
            break;
        case "3":
            Schnittstelle.clearCons();
            Schnittstelle.outPut(Texte.getCredits());
            Schnittstelle.outPut(Texte.zurueckZumMenue());
            break;
        case "4":
            Schnittstelle.closeScanner();
            System.exit(0);
            break;
        default:
            Schnittstelle.outPut(Texte.getFehler404());
            Schnittstelle.outPut(Texte.zurueckZumMenue());
            break;
        }
        Schnittstelle.inPut();
        Schnittstelle.clearCons();
        if (GlobalData.isMenuAktiv == true)
        {
            auswahl(Schnittstelle);
        }
    }

    public void setAblauf(int[] ablauf)
    {
        this.ablauf = ablauf;
    }
}