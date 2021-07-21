package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A2;

public class AdressTest {
	
	public static void main(String[] args) {
		Adress a = new Adress ("Friedrich-Streib-Str. 2", 96406, "Coburg");
		
		if (a.getOrt().equals("Coburg") &&
			a.getStrassenName().equals("Friedrich-Streib-Str. 2") &&
			a.getPlz() == 	96406)
			System.out.println("TestCase 1 correct");
		else
			System.out.println("TestCase 2 false");
		
	}

}
