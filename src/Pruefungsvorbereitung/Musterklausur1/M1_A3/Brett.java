package Pruefungsvorbereitung.Musterklausur1.M1_A3;

import java.io.*;
import java.time.LocalDateTime;

public class Brett {

    private Brettfigur[][] spielbrett;
    private final String FILENAME = "Brettspiel-Protokoll_" + LocalDateTime.now().toString() + ".txt";

    public Brett(Brettfigur[][] brett){
        spielbrett  = brett;
        protocol();
    }

    public void ziehen(int x, int y){
        if (spielbrett[y][x] != null) {
            int newX = x;
            int newY = y + spielbrett[y][x].zug();
            Brettfigur oldPos = spielbrett[y][x];
            Brettfigur newPos = spielbrett[newY][newX];
            spielbrett[y][x] = newPos;
            spielbrett[newY][newX] = oldPos;
        }
        protocol();
    }
    
    public void print() {
            System.out.println(toString());
    }

    public void protocol(){
        String source = "src/Pruefungsvorbereitung/Musterklausur1/M1_A3/" + FILENAME;
        try{
            File file =new File(source);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(LocalDateTime.now().toString() + "\n");
            bw.write(toString() + "\n");

            bw.close();

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i <= spielbrett.length - 1; i++) {
            for (int j = 0; j <= spielbrett[i].length - 1; j++) {
                if (spielbrett[i][j] != null)
                    out.append(spielbrett[i][j].toString()).append("  ");
                else {
                    if ((i + j) % 2 == 1)
                        out.append("#  ");
                    else
                        out.append("-  ");
                }
            }
            out.append("\n");
        }
        return out.toString();
    }
}
