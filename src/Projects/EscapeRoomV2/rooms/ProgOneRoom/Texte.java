package Projects.EscapeRoomV2.rooms.ProgOneRoom;

public class Texte
{
        // das Erzeugen eines Objektes sperren
        private Texte()
        {
        }

        // Abbruchtext
        private static final String abbruch = "\t(Zum Beenden \"exit\" eingeben.)";

        // Menu
        private static final String menuText = "Willkommen beim Escape Room Spiel der Hochschule Coburg\n\n"
                        + "1 - Neues Spiel\n" + "2 - Optionen\n" + "3 - Credits\n" + "4 - Spiel Beenden"
                        + "\nZahl eingeben und mit \"ENTER\" bestätigen.";
        private static final String fehler404 = "Fehler 404\nYour brain was not found again.\n";
        private static final String zurueckZumMenue = "Mit \"ENTER\" zurück zum Menu";
        private static final String credits = "Lead Developer:\t\tChristian Rähder"
                        + "\nHead of Development:\tChristoph Marks" + "\nLead Level Designer:\tAlexej Hermann"
                        + "\nMascot & Presenter:\tDimitri Stoppel\n";

        // Einleitung
        private static final String intro = "Willkommen an der Hochschule Coburg.\nSie sind Student im Kurs Programmieren. "
                        + "Nach Ihrer Präsenzstunde in Programmieren haben Sie im Labor leider etwas vergessen\nund wollten dies noch schnell holen. "
                        + "Als Sie das Labor wieder verlassen wollten, stellen Sie fest, dass die Tür zu ist.\n"
                        + "Leider kennen Sie die Zahlenkombination nicht, um die Tür zu öffnen.\nSie erinnern sich aber, dass Ihr Professor erwähnt hatte, dass die Kombination im Raum versteckt ist. ";

        // Rätsel 1
        private static final String startR1 = "\n\nSie durchsuchen den Raum und finden als erstes ein verdächtiges Poster bezüglich Fundamentaler Datentypen.\n"
                        + "Auf diesem stellen Sie fest das alle Längen (in Bit) angegeben sind außer einem.";
        private static final String hilfeR1 = "Wie war nochmal die Bitlänge dieses Datentyps?";
        private static final String codeR1 = "codeR1";
        private static final String falschR1 = "Leider falsch, versuchen Sie es erneut.";
        private static final String richtigR1 = "Gut gemacht!";

        // Rätsel 2
        private static final String startR2 = "Die erste Zahl wäre damit gefunden. Denken Sie daran der Professer hat immer \"Post it\" an seinem Monitor "
                        + "im Labor damit wichtiges nicht verloren geht.\nAls Sie den Arbeitsplatz des Professors untersuchen sticht Ihnen ein besonderes \"Post it\" ins Auge.\n"
                        + "Auf diesem sehen Sie folgende Anweisung:\n\n"
                        + "\n+------------------------------------------+\n"
                        + "| int a = 5, b = 4, c = 11;                |\n"
                        + "|                                          |\n"
                        + "| if(++b != a)                             |\n"
                        + "|    System.out.println(\"8\");              |\n"
                        + "| else if((c - a) == ++b)                  |\n"
                        + "|    System.out.println(\"14\");             |\n"
                        + "| else if((a-- == b) && (a + b == 9))      |\n"
                        + "|    System.out.println(\"10\");             |\n"
                        + "| else                                     |\n"
                        + "|    System.out.println(\"42\");             |\n"
                        + "+------------------------------------------+\n\n"
                        + "Was wird auf der Konsole ausgegeben?\t\t";
        private static final String hilfeR2 = "hilfeR2";
        private static final String codeR2 = "codeR2";
        private static final String falschR2 = "Schade, knapp daneben ist auch vorbei...";
        private static final String richtigR2 = "Richtig! Weiter so!";

        // Rätsel 3
        private static final String startR3 = "Zwei benötigte Zahlen haben Sie schon einmal gefunden.\n"
                        + "Als nächstes öffnen Sie die Schränke des Labors und finden darin ein SteckPuzzel.\n";
        private static final String hilfeR3 = "\nDabei fällt Ihnen als erfahrener Programmierer sofort auf, "
                        + "dass die Anordnung nicht korrekt ist!\nWie ist die richtige Typkonvertierung von fundamentalen Datentypen anzuordnen?";
        private static final String eingabeAufforderungR3 = "\nTragen Sie die Nummern nacheinander zusammen ein (z.B.\"123456\" und drücken dann \"ENTER\".\t\t";
        private static final String falschR3 = "Netter Versuch, aber nicht ganz richtig.";
        private static final String richtigR3 = "Super. Fast fertig...";

        // Rätsel 4 zusätzliches Rätsel hier einfügen
        // private static String startR4 = "\n\nPlatzhalter für zusätzliches Rätsel"
        // private static String hilfeR4 = "hilfeR4";
        // private static String codeR4 = "codeR4";
        // private static String falschR4 = "falsch";
        // private static String richtigR4 = "richtig";

        // Passwort Eingabe
        private static final String startEnde = "\n\nErleichtert und sichtbar ermüdet von den Strapazen machen Sie sich auf zum Türschloss.\n"
                        + "An der Tür angekommen ist es nun endlich soweit diesem Labor zu entkommen.\n\n"
                        + "Addiere Sie die Zahlen zusammen und konvertiere sie in eine Hex Zahl!\n"
                        + "Bitte geben Sie das korrekte Passwort ein;\n";
        private static final String eingabeAufforderungEnde = "Ausgabe:";
        private static final String falschEnde = "Uff so knapp.... Versuche es erneut.";
        private static final String richtigEnde = "Saubääääärrrrrr...";

        // Epilog
        private static final String epilog = "\n\nNachdem Sie die Zahlenkombination eingegeben haben, hören Sie wie sich das Schloss entriegelt.\n"
                        + "Sie öffnen die Tür und freuen sich endlich nach Hause gehen zu können, jedoch steht der Dozent hinter der Tür.\n"
                        + "Verwundert sieht er Sie an und fragt: \"Was machen Sie da?\"\nDaraufhin erklären Sie ihm die Situation und wie Sie die Rätsel gemeistert haben.\n"
                        + "Mit einem Schulterklopfen sagt er: \"Anscheinend haben Sie ihr Material gelernt. Jetzt gehen Sie nach Hause Sie haben es sich verdient\".\n"
                        + "Ohne drüber nachzudenken verabschieden Sie sich und machen sich auf den Weg, jedoch beim gehen bemerken Sie, wie der Dozent die Tür abschließen muss.\n"
                        + "Das bringt Sie zum nach denken...";

        public static String getAbbruch()
        {
                return abbruch;
        }

        public static String getMenuText()
        {
                return menuText;
        }

        public static String getFehler404()
        {
                return fehler404;
        }

        public static String zurueckZumMenue()
        {
                return zurueckZumMenue;
        }

        public static String getCredits()
        {
                return credits;
        }

        public static String getIntro()
        {
                return intro;
        }

        public static String getStartR1()
        {
                return startR1;
        }

        public static String getHilfeR1()
        {
                return hilfeR1;
        }

        public static String getCodeR1()
        {
                return codeR1;
        }

        public static String getFalschR1()
        {
                return falschR1;
        }

        public static String getRichtigR1()
        {
                return richtigR1;
        }

        public static String getStartR2()
        {
                return startR2;
        }

        public static String getHilfeR2()
        {
                return hilfeR2;
        }

        public static String getCodeR2()
        {
                return codeR2;
        }

        public static String getFalschR2()
        {
                return falschR2;
        }

        public static String getRichtigR2()
        {
                return richtigR2;
        }

        public static String getStartR3()
        {
                return startR3;
        }

        public static String getHilfeR3()
        {
                return hilfeR3;
        }

        public static String getEingabeAufforderungR3()
        {
                return eingabeAufforderungR3;
        }

        public static String getFalschR3()
        {
                return falschR3;
        }

        public static String getRichtigR3()
        {
                return richtigR3;
        }

        // public String getStartR4()
        // {
        // return startR4;
        // }

        // public String getHilfeR4()
        // {
        // return hilfeR4;
        // }

        // public String getCodeR4()
        // {
        // return codeR4;
        // }

        // public String getFalschR4()
        // {
        // return falschR4;
        // }

        // public String getRichtigR4()
        // {
        // return richtigR4;
        // }

        public static String getStartEnde()
        {
                return startEnde;
        }

        public static String getEingabeAufforderungEnde()
        {
                return eingabeAufforderungEnde;
        }

        public static String getFalschEnde()
        {
                return falschEnde;
        }

        public static String getRichtigEnde()
        {
                return richtigEnde;
        }

        public static String getEpilog()
        {
                return epilog;
        }
}