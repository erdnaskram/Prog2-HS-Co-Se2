package Projects.EscapeRoomV2.rooms.ProgOneRoom;

import Projects.EscapeRoomV2.InOut;

public class EscapeRoom
{
    // die Eigenschaften
    private String startText;
    private int[] riddleNumbers;
    // private String[] loesungen;
    private InOut Schnittstelle;
    // private String finalPswd;
    private Riddle myRiddle;

    /**
     * Im Konstruktor wird ein Objekt vom Typ Riddle erzeugt. Diesem wird der Start
     * Text, der Ablauf und die Schnittstelle vom Typ InOut übergeben
     * 
     * @param startText
     * @param ablauf
     * @param Schnittstelle
     * @loesungen Anhand der Größe vom Array ablauf wird das Array loesungen
     *            erstellt
     */
    public EscapeRoom(String startText, int[] ablauf, InOut Schnittstelle)
    {
        this.startText = startText;
        this.riddleNumbers = ablauf;
        this.Schnittstelle = Schnittstelle;

        GlobalData.loesungen = new String[ablauf.length];
        this.myRiddle = new Riddle(Schnittstelle, ablauf.length);
    }

    public void start()
    {
        Schnittstelle.outPut(startText);
        for (int i = 0; i < riddleNumbers.length; i++)
        {
            GlobalData.loesungen[i] = myRiddle.raetselSuche(riddleNumbers[i]);
        }
        abschlussPswd(GlobalData.loesungen);
    }

    private void abschlussPswd(String[] loesungen)
    {
        boolean geloest = false;
        int sum = 0;
        int[] z = new int[loesungen.length];

        Schnittstelle.clearCons();

        for (int i = 0; i < loesungen.length - 1; i++)
        {
            z[i] = Integer.parseInt(loesungen[i]);
            sum += z[i];
        }

        GlobalData.finalPswd = Integer.toHexString(sum);

        Schnittstelle.outPut(Texte.getStartEnde());

        for (int i = 0; i < z.length - 1; i++)
        {
            Schnittstelle.outPut(Integer.toString(z[i]));
        }

        Schnittstelle.outPut(Texte.getEingabeAufforderungEnde(), false);
        Schnittstelle.outPut(Texte.getAbbruch());
        do
        {
            String antwort = Schnittstelle.inPut();
            System.out.println("-------------------------------------------------");
            if ((antwort.toLowerCase()).equals(GlobalData.finalPswd))
            {

                Schnittstelle.outPut(Texte.getRichtigEnde());
                geloest = true;
            }
            else
            {

                Schnittstelle.outPut(Texte.getFalschEnde());
            }
        } while (!geloest);
        Schnittstelle.outPut(Texte.getEpilog());
    }

    public String getStartText()
    {
        return this.startText;
    }

    public int[] getRiddleNumbers()
    {
        return this.riddleNumbers;
    }

    // public String[] getLoesungen()
    // {
    // return this.loesungen;
    // }

    // public String getFinalPswd()
    // {
    // return finalPswd;
    // }

    public Riddle getMyRiddle()
    {
        return myRiddle;
    }

    public String toString()
    {
        String outPutString = "startText: " + getStartText() + "\"riddleNumbers: ";
        for (int item : getRiddleNumbers())
        {
            outPutString += item + " ";
        }
        outPutString += "loesungen: ";
        // for (String item : getLoesungen())
        // {
        // outPutString += item + " ";
        // }
        // outPutString += "finalPswd: " + getFinalPswd();

        return outPutString;
    }
}