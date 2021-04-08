package Projects.EscapeRoomV2.testEscapeRoom;

import Projects.EscapeRoomV2.Game;
import Projects.EscapeRoomV2.InOut;

public class GameTest
{
    private GameTest(){}
    public static void main(String[] args)
    {
        int[] testAblauf =
        { 1, 2, 3 };
        InOut testSchnittstelle = new InOut(true);
        Game testGame = new Game(testSchnittstelle, testAblauf);
        testGame.Start();
        System.out.println("\ngameTest ist fertig");
    }
}
