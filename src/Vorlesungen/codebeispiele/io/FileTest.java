package Vorlesungen.codebeispiele.io;
import java.io.*;



public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f = new File("Java\\hallo.txt");
		System.out.println(f.getName() + "\n" + f.getPath()+ "\n" + f.getAbsolutePath() + "\n" + f.getParent());
		try {
			File tmp = File.createTempFile("xyz", ".tmp", null);
			System.out.println(tmp);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}


