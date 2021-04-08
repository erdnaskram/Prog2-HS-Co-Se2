package Projects.EscapeRoomV2;

import Projects.EscapeRoomV2.rooms.ProgOneRoom.EscapeRoom;
import Projects.EscapeRoomV2.rooms.ProgOneRoom.Texte;

public class Game
{
    private EscapeRoom myRoom;

    /**
     * Das Objekt vom Typ Game wird benutzt um einen Escaperoom zu initialisieren
     * und um die Rätsel und dessen Reihenfolge festzulegen.
     * 
     * @param schnittstelle Es muss ein Objekt vom Typ InOut übergeben werden,
     *                      welches als Schnittstelle zwischen dem Spiel undd er
     *                      "grafischen Oberfläche dient".
     * @param ablauf        Jede Zahl in diesem Array steht für ein bestimmtes
     *                      Rätsel. Siehe dazu "Riddle.java".
     */
    public Game(InOut schnittstelle, int[] ablauf)
    {
        myRoom = new EscapeRoom(Texte.getIntro(), ablauf, schnittstelle);
    }

    public void Start()
    {
        myRoom.start();
    }
}