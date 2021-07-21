package Pruefungsvorbereitung.Musterklausur1.Musterloesung;

import java.io.*;

public class Umwandle {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("usage Umwandle <input filename> <output filename>");
			System.exit(1);
		}
		

		try ( BufferedReader br = new BufferedReader(new FileReader(args[0]));
			  BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));){
			int c;
			while ( (c = br.read()) != -1) {
				char cc = (char)c;
				if (cc == 'X')
					bw.write(' ');
				else if (cc == ' ')
					bw.write('X');
				else 
					bw.write(cc);
			}
				
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
