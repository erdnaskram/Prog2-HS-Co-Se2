package kap1.zusatzException;

public class ChessFiled {

    public boolean checkChessField(String txt) throws IllegalFieldException {

        txt = txt.trim();
        String errorMessage;
        boolean fehler = false;

        if (txt.length() > 2){
            throw new IllegalFieldException("Feldbezeichnung \""+ txt + "\" zu lang");
        } else if (txt.length() < 2) {
            throw new IllegalFieldException("Feldbezeichnung \""+ txt + "\" zu kurz");
        }

        char col = txt.charAt(0);
        //Buchstaben


        int row = 0;
        try {
            row = Integer.parseInt(txt.substring(1,2));
        } catch (NumberFormatException e) {
            throw new IllegalFieldException("Spaltennummer \"" + row + "\" muss einen Zahl sein (1-8)");
        }
        if (row < '1' || row > '8'){
            throw new IllegalFieldException("Spaltennummer \"" + row + "\" ist nicht korrekt");
        }


        return false;
    }
}
