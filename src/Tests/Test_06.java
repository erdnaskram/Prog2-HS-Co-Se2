package Tests;

import java.io.IOException;
import java.io.StringReader;

public class Test_06 {
        public static void main(String args[]) {
            StringReader r = new StringReader("All is well");
            for (int i = 0; i < 6; i++) {
                char ch = 0;
                try {
                    ch = (char) r.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print(ch + "");
            }
            r.close();

    }
}
