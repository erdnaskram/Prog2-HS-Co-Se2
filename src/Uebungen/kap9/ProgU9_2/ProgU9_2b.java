package Uebungen.kap9.ProgU9_2;

import java.io.*;

public class ProgU9_2b {

    private static final int POINT = '.';
    private static final int COMMA = ',';
    private static final int EXCLAMATION_MARK = '!';

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            streamTokenizerWithDefaultConfiguration(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("t");
    }

    public static void streamTokenizerWithDefaultConfiguration(Reader reader) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(reader);

        int currentToken = streamTokenizer.nextToken();
        while (currentToken != StreamTokenizer.TT_EOF) {

            switch (streamTokenizer.ttype) {
                case POINT -> System.out.println("Zeichen: .");
                case EXCLAMATION_MARK -> System.out.println("Zeichen: !");
                case COMMA -> System.out.println("Zeichen: ,");
                case StreamTokenizer.TT_WORD -> System.out.println("Wort: " + streamTokenizer.sval);
                case StreamTokenizer.TT_NUMBER -> System.out.println("Nummer: " + streamTokenizer.nval);
            }

            currentToken = streamTokenizer.nextToken();
        }
    }
}
