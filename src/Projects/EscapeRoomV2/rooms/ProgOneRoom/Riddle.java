package Projects.EscapeRoomV2.rooms.ProgOneRoom;

import java.util.Random;

import Projects.EscapeRoomV2.InOut;

public class Riddle
{
    private InOut Schnittstelle;

    /**
     * Im Konstruktor wird ein Objekt vom Typ Riddle erzeugt. Diesem wird die
     * Schnittstelle vom Typ InOut und die Anzahl der Rätsel übergeben
     * 
     * @param Schnittstelle
     * @param anzahlDerRaetsel
     */
    public Riddle(InOut Schnittstelle, int anzahlDerRaetsel)
    {
        this.Schnittstelle = Schnittstelle;
        GlobalData.loesungen = new String[anzahlDerRaetsel + 1];
        for (String item : GlobalData.loesungen)
        {
            item = "0";
            Schnittstelle.debugLog("Lösung: " + item, true);
        }
    }

    public String raetselSuche(int nummer)
    {
        switch (nummer)
        {
        case 1:
            return raetsel1(Schnittstelle);
        case 2:
            Schnittstelle.clearCons();
            return raetsel2(Schnittstelle);
        case 3:
            Schnittstelle.clearCons();
            return raetsel3(Schnittstelle);
        default:
            Schnittstelle.outPut("Nummer für Rätselwahl nicht vergeben.", true);
            GlobalData.loesungen[GlobalData.loesungen.length - 1] = "5";
            return GlobalData.loesungen[GlobalData.loesungen.length - 1];
        }
    }

    private static String raetsel1(InOut Schnittstelle)
    {

        String[] groese =
        { "01", "08", "16", "16", "32", "32", "64", "64" };
        String[] typen =
        { "boolean", "byte", "short", "char", "int", "float", "long", "double" };

        Random rn = new Random();
        boolean geloest = false;

        int lsgNummer = rn.nextInt(groese.length);
        String gesucht = typen[lsgNummer];
        GlobalData.loesungen[0] = groese[lsgNummer];

        groese[lsgNummer] = "XX";

        Schnittstelle.outPut(Texte.getStartR1());
        Schnittstelle.outPut("\n+-------------------+\n" + "| short      " + groese[2] + " bit |\n" + "| long       "
                + groese[6] + " bit |\n" + "| byte       " + groese[1] + " bit |\n" + "| double     " + groese[7]
                + " bit |\n" + "| flaot      " + groese[5] + " bit |\n" + "| boolean    " + groese[0] + " bit |\n"
                + "| char       " + groese[3] + " bit |\n" + "| int        " + groese[4] + " bit |\n"
                + "+-------------------+\n");
        Schnittstelle.outPut("Wie viele Bits hat " + gesucht + "?   (Eingabebeispiel: \"01\")\t\t", false);

        do
        {
            Schnittstelle.outPut(Texte.getAbbruch());
            String antwort = Schnittstelle.inPut();

            if (antwort.equals(GlobalData.loesungen[0]))
            {
                Schnittstelle.outPut(Texte.getRichtigR1());
                geloest = true;
            }
            else
            {
                Schnittstelle.outPut(Texte.getFalschR1(), false);
            }
        } while (!geloest);

        return GlobalData.loesungen[0];
    }

    private String raetsel2(InOut Schnittstelle)
    {
        GlobalData.loesungen[1] = "42";

        boolean geloest = false;

        Schnittstelle.outPut(Texte.getStartR2(), false);

        do
        {
            Schnittstelle.outPut(Texte.getAbbruch());
            String antwort = Schnittstelle.inPut();
            if (antwort.equals(GlobalData.loesungen[1]))
            {
                Schnittstelle.outPut(Texte.getRichtigR2());
                geloest = true;
            }
            else
            {
                Schnittstelle.outPut(Texte.getFalschR2(), false);
            }
        } while (!geloest);

        return GlobalData.loesungen[1];
    }

    private String raetsel3(InOut Schnittstelle)
    {
        String[] orginal =
        { "byte", "short", "int", "long", "float", "double" };
        String[] raetsel = new String[6];
        GlobalData.loesungen[2] = null;
        Random rn = new Random();

        boolean geloest = false;

        for (int i = 0; i < 6; i++)
        {
            int pos;
            if (i == 0)
            {
                pos = rn.nextInt(6);
                raetsel[pos] = orginal[i];
                GlobalData.loesungen[2] = String.valueOf(pos);
            }
            else
            {
                do
                {
                    pos = rn.nextInt(6);
                } while (raetsel[pos] != null);
                raetsel[pos] = orginal[i];
                ;
                GlobalData.loesungen[2] = GlobalData.loesungen[2] + pos;
            }
        }

        Schnittstelle.outPut(Texte.getStartR3());
        Schnittstelle.outPut("+-----------------+");

        for (int i = 0; i < 6; i++)
        {
            Schnittstelle.outPut("| " + raetsel[i] + ":     \t" + i + " |");
        }
        Schnittstelle.outPut("+-----------------+\n");
        Schnittstelle.outPut(Texte.getHilfeR3());

        do
        {
            Schnittstelle.outPut(Texte.getEingabeAufforderungR3(), false);
            Schnittstelle.outPut(Texte.getAbbruch());
            String antwort = Schnittstelle.inPut();
            if (antwort.equals(GlobalData.loesungen[2]))
            {
                Schnittstelle.outPut(Texte.getRichtigR3());
                geloest = true;
            }
            else
            {
                Schnittstelle.outPut(Texte.getFalschR3(), false);
            }
        } while (!geloest);

        return GlobalData.loesungen[2];
    }
}