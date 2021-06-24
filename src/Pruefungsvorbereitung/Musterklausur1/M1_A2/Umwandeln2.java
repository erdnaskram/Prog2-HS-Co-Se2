package Pruefungsvorbereitung.Musterklausur1.M1_A2;

import java.io.*;

public class Umwandeln2 {

    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("bla <>");
            System.exit(1);
        }

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(args[0]));
            bw = new BufferedWriter(new FileWriter(args[0]));

            for (int c; (c= br.read()) != -1;){
                char cc = (char)c;

                if (cc == 'X')
                    bw.write(' ');
                else if (cc == ' ')
                    bw.write('X');
                else
                    bw.write(cc);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("fiech ned gefunden");
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
