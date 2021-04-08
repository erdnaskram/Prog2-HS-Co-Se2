package Projects.EscapeRoomV2;

import java.util.Scanner;
import Projects.EscapeRoomV2.rooms.ProgOneRoom.GlobalData;

public class InOut
{
    Scanner sc;
    private boolean isTest = false;
    private int menuZaehler;
    private int antwortZaehler;

    /**
     * Nutze den Konstruktor "InOut()", um Eingaben und Ausgaben für den Spieler zu
     * realisieren.
     * 
     * Der Konstruktor "InOut(boolean isTest)" wird benutzt, um das Spiel zu testen.
     */
    public InOut()
    {
        sc = new Scanner(System.in);
        GlobalData.isMenuAktiv = true;
    }

    /**
     * Nutze den Konstruktor "InOut(boolean isTest)", um das Spiel zu testen.
     * 
     * @param isTest muss auf "false" gesetzt werden, um den TestModus zu benutzen.
     *               Antworten werden dann automatisch generiert.
     * 
     * @andereKonstruktoren Der Konstruktor "InOut()" wird benutzt, um Eingaben und
     *                      Ausgaben für den Spieler zu realisieren.
     */
    public InOut(boolean isTest)
    {
        this();
        this.isTest = isTest;
        this.antwortZaehler = -1;
        this.menuZaehler = -1;
    }

    /**
     * Schließt das Scanner Objekt
     */
    public void closeScanner()
    {
        this.sc.close();
    }

    /**
     * Methode zur Bereinigung der Konsolenausgaben in der Produktivumgebung
     */
    public void clearCons()
    {
        if (true)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    /**
     * Konsolenausgabe
     * 
     * @param tmpText Dieser Übergabeparameter wird ausgegeben.
     */
    public void outPut(String tmpText)
    {
        System.out.println(tmpText);
    }

    /**
     * Konsolenausgabe mit Auswahl "\n" oder nicht
     * 
     * @param tmpText      Dieser Übergabeparameter wird ausgegeben.
     * @param withNextLine {@code"true"} --> Zeilenumbruch am Ende
     *                     {@code"false"} --> kein Zeilenumbruch am Ende
     * 
     */
    public void outPut(String tmpText, boolean withNextLine)
    {
        if (withNextLine == true)
        {
            System.out.println(tmpText);
        }
        else
        {
            System.out.print(tmpText);
        }
    }

    /**
     * Konsoleneingabe
     * 
     * @isTest wird einmalig beim erzeugen des Objektes einmalig gesetzt
     * @isTest=true in der Testumgebung --> manuelle Konsoleneingabe
     * @isTest=false in der Produktivumgebung --> simulierte Konsoleneingabe
     */
    public String inPut()
    {
        // manuelle Konsoleneingabe
        // in der Produktivumgebung
        if (isTest == false)
        {
            String tmpString;
            tmpString = sc.nextLine();

            if (tmpString.toLowerCase().equals("exit"))
            {
                System.exit(0);
            }
            return tmpString;
        }
        // simulierte Konsoleneingabe
        // in der Testumgebung
        else
        {
            menuZaehler++;
            if (GlobalData.isMenuAktiv == true)
            {
                System.out.println("++++++++++++++++" + menuZaehler + "+++++++++++++++++++++");
                switch (menuZaehler)
                {
                case 0:
                    return "3";
                case 1:
                    return "Enter";
                case 2:

                    return "2";
                case 3:
                    return "Enter";
                case 4:
                    GlobalData.isMenuAktiv = false;
                    return "1";
                case 5:
                    return "Enter";
                default:
                    System.out.println("Bei dem Menütest gibt es ein Problem");
                    return "4";
                }
            }
            else
            {
                antwortZaehler++;
                if (antwortZaehler < GlobalData.loesungen.length - 1)
                {
                    return GlobalData.loesungen[antwortZaehler];
                }
                else
                {
                    antwortZaehler = -1;
                    return GlobalData.finalPswd;
                }

            }
        }
    }

    // Konsolenausgabe
    // in Testumgebung
    public void debugLog(String tmpText, boolean withNextLine)
    {
        if (isTest == true)
        {
            if (withNextLine == true)
            {
                System.out.println(tmpText);
            }
            else
            {
                System.out.print(tmpText);
            }
        }
    }

    public boolean getIsTest()
    {
        return isTest;
    }
}