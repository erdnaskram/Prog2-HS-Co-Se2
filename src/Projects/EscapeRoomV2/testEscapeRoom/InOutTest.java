package Projects.EscapeRoomV2.testEscapeRoom;

import Projects.EscapeRoomV2.rooms.ProgOneRoom.GlobalData;
import Projects.EscapeRoomV2.InOut;

public class InOutTest
{
    private InOutTest()
    {
    }

    public static void main(String[] args)
    {
        int counter = 0;
        InOut normalInOutTestObjekt;
        InOut testingInOutTestObjekt;

        GlobalData.loesungen = new String[2];
        GlobalData.loesungen[0] = "5";
        GlobalData.loesungen[1] = "42";

        System.out.println("__________________________________________________________________");
        System.out.println("\"Erzeugen und Testen des normalen INOut Objektes\"");
        normalInOutTestObjekt = new InOut();
        System.out.println("\nZuerst die Ausgabe: Diese sind von der Art des InOut-Objektes unabhängig.\n");
        normalInOutTestObjekt
                .outPut("Ausgabe mit der alten \"outPut-Methode\". Diese hat immer einen Zeilenumbruch am Ende");
        normalInOutTestObjekt.outPut(
                "Ausgabe mit der neuen \"outPut-Methode\". Der Zeilenumbruch am Ende kann über den Boolean gesetzt werden (hier ohne).  ",
                false);
        normalInOutTestObjekt.outPut(
                "Ausgabe mit der neuen \"outPut-Methode\". Der Zeilenumbruch am Ende kann über den Boolean gesetzt werden (hier mit).   ",
                true);

        System.out.println("\n\n\"Die Methode \"debugLog\" erzeugt nur im Testmodus eine Ausgabe."
                + "Es kann ebenfalls der Zeilenumbruch am Ende eingestellt werden.\"");
        normalInOutTestObjekt.debugLog("ich sollte nicht zu sehen sein.", true);

        System.out.println("\n\nGeben Sie etwas ein, um die Einagbe zu testen.");
        GlobalData.finalPswd = normalInOutTestObjekt.inPut();

        System.out.println("\nDurch erneutes betätigen der \"ENTER-Taste\" wird der Inhalt der Console gelöscht");
        normalInOutTestObjekt.inPut();
        normalInOutTestObjekt.clearCons();
        System.out.println("\"Der Test des normalen INOut Objektes war erfolgreich.\"");
        System.out.println("__________________________________________________________________");

        System.out.println("__________________________________________________________________");
        System.out.println("\"Erzeugen und Testen des test INOut Objektes\"");
        testingInOutTestObjekt = new InOut(true);
        System.out.println("\nZuerst die Ausgabe: Diese sind von der Art des InOut-Objektes unabhängig."
                + "\n Dies soll lediglich noch mal gezeigt werden\n");
        testingInOutTestObjekt
                .outPut("Ausgabe mit der alten \"outPut-Methode\". Diese hat immer einen Zeilenumbruch am Ende");
        testingInOutTestObjekt.outPut(
                "Ausgabe mit der neuen \"outPut-Methode\". Der Zeilenumbruch am Ende kann über den Boolean gesetzt werden (hier ohne).  ",
                false);
        testingInOutTestObjekt.outPut(
                "Ausgabe mit der neuen \"outPut-Methode\". Der Zeilenumbruch am Ende kann über den Boolean gesetzt werden (hier mit).   ",
                true);

        System.out.println("\n\n\"Die Methode \"debugLog\" erzeugt nur bei der Verwendung als Testobjekt eine Ausgabe."
                + "Es kann ebenfalls der Zeilenumbruch am Ende eingestellt werden.\"");
        testingInOutTestObjekt.debugLog("\"Ich bin ein DebugLog ohne Zeilenumbruch\".", false);
        testingInOutTestObjekt.debugLog("\"Ich bin ein DebugLog mit Zeilenumbruch\".", true);

        System.out.println("\n\nAutomatische Eingabe startet.");
        GlobalData.isMenuAktiv = false;

        do
        {
            counter++;
        } while (GlobalData.finalPswd != testingInOutTestObjekt.inPut() || counter < 50);

        System.out.println("\nDurch erneutes betätigen der \"ENTER-Taste\" wird der Test beendet");
        System.out.println("\"Der Inhalt der Konsole wurde nicht gelöscht, da InOut sich im TestModus befindet.\"");
        testingInOutTestObjekt.inPut();
        testingInOutTestObjekt.clearCons();
        System.out.println("\"Der Test des test INOut Objektes war erfolgreich.\"");
    }
}
