package Vorlesungen.codebeispiele.io;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		try {

			int[] zahlen = new int[5];
			int sum = 0;
			BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Bitte " + (i+1) + ". Zahl eingeben");
				zahlen[i] = Integer.parseInt(din.readLine());
			}

			for (int i=0; i< zahlen.length;i++) {
				sum += zahlen[i];
				System.out.print(" " + zahlen[i] );
				if (i != zahlen.length-1)
					System.out.print(" + " );
			}
			
			System.out.println(" = " + sum);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Wrong Input");

		}
	}

}
