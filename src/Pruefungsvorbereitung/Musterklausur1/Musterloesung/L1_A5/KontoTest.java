package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A5;

public class KontoTest {

	public static void main(String[] args) {
		Konto k;
		
		for (int i = 0; i < 20; i++) {
			k= new Konto();
			System.out.println(k);
		}
		try {
		
		Konto k2= new Konto();
		
		k2.einzahlen(500);
		if (k2.getKontoStand() == 500) {
			System.out.println("TestCase 1 correct");
		}
		else  
			System.out.println("TestCase 1 false");
		
		
		k2.auszahlen(1000);
		if (k2.getKontoStand() == -500) {
			System.out.println("TestCase 2 correct");
		}
		else  
			System.out.println("TestCase 2 false");
		
		k2.undoLastOperation();
		if (k2.getKontoStand() == 500) {
			System.out.println("TestCase 3 correct");
		}
		else  
			System.out.println("TestCase 3 false");
		
		k2.einzahlen(300);
		k2.undoLastOperation();
		if (k2.getKontoStand() == 500) {
			System.out.println("TestCase 4 correct");
		}
		else  
			System.out.println("TestCase 4 false");
		
		}
		catch (Exception e) { 
			System.out.println("All TestCases  false");
		
		}
		
		try {
			Sparkonto s1 = new Sparkonto(-300);
			System.out.println("TestCase 5 false");
		}
		catch (Exception e) {
			System.out.println("TestCase 5 correct");
		}
		
		try {
			Sparkonto s1 = new Sparkonto(300);
			s1.auszahlen(300);
			System.out.println("TestCase 6 false");
		}
		catch (Exception e) {
			System.out.println("TestCase 6 correct");
		}
		try {
			Sparkonto s1 = new Sparkonto(300);
			s1.auszahlen(400);
			System.out.println("TestCase 7 false");
		}
		catch (Exception e) {
			System.out.println("TestCase 7 correct");
		}
		try {
			Sparkonto s1 = new Sparkonto(300);
			s1.auszahlen(250);
			System.out.println("TestCase 8 correct");
		}
		catch (Exception e) {
			System.out.println("TestCase 8 false");
		}
		try {
			Sparkonto s1 = new Sparkonto(300);
			s1.auszahlen(250);
			s1.auszahlen(30);
			s1.undoLastOperation();
			if (s1.getKontoStand() == 50)
				System.out.println("TestCase 9 correct");
			else 
				System.out.println("TestCase 9 false");
		}
		catch (Exception e) {
			System.out.println("TestCase 9 false");
		}
		
		try {
			Girokonto g1 = new Girokonto(0, 1000);
			g1.auszahlen(250);
			g1.auszahlen(30);
			System.out.println("TestCase 10 correct");
		}
		catch (Exception e) {
			System.out.println("TestCase 10 false");
		}
		try {
			Girokonto g1 = new Girokonto(0, 1000);
			g1.auszahlen(1250);
			System.out.println("TestCase 11 false ");
			
		}
		catch (Exception e) {
			System.out.println("TestCase 11 correct");
		}
		try {
			Girokonto g1 = new Girokonto(-500, 1000);
			System.out.println("TestCase 12 correct ");
		}
		catch (Exception e) {
			System.out.println("TestCase 12 false");
		}
		try {
			Girokonto g1 = new Girokonto(-1500, 1000);
			System.out.println("TestCase 13 false ");
		}
		catch (Exception e) {
			System.out.println("TestCase 13 correct");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			if (k1.getKontoStand() != -20000)
				System.out.println("TestCase 14 false ");
			else 
				System.out.println("TestCase 14 correct ");
		}
		catch (Exception e) {
			System.out.println("TestCase 14 false");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(-20000);
			System.out.println("TestCase 15 false ");
			
		}
		catch (Exception e) {
			System.out.println("TestCase 15 correct");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			k1.auszahlen(100);
			System.out.println("TestCase 16 false ");
			
		}
		catch (Exception e) {
			System.out.println("TestCase 16 correct");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			k1.einzahlen(10000);
			k1.einzahlen(2000);
			if (k1.getKontoStand() != -8000)
				System.out.println("TestCase 18 false ");
			else 
				System.out.println("TestCase 18 correct ");
		}
		catch (Exception e) {
			System.out.println("TestCase 18 correct");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			k1.einzahlen(22000);
			System.out.println("TestCase 19 false ");
			
		}
		catch (Exception e) {
			System.out.println("TestCase 19 correct");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			k1.einzahlen(20000);
			System.out.println("TestCase 20 correct ");
		}
		catch (Exception e) {
			System.out.println("TestCase 20 false");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			k1.einzahlen(5000);
			k1.einzahlen(4000);
			k1.undoLastOperation();
			if (k1.getKontoStand() != -15000)
				System.out.println("TestCase 21 false ");
			else 
				System.out.println("TestCase 21 correct ");
		}
		catch (Exception e) {
			System.out.println("TestCase 21 false");
		}
		try {
			Kreditkonto k1 = new Kreditkonto(20000);
			k1.einzahlen(5000);
			k1.einzahlen(4000);
			
			System.out.println(k1);
			Girokonto g1 = new Girokonto(0, 1000);
			g1.auszahlen(250);
			System.out.println(g1);
			Sparkonto s1 = new Sparkonto(300);
			s1.einzahlen(300);
			System.out.println(s1);
			
			
		}
		catch (Exception e) {
			System.out.println("TestCase 22 false");
		}
	}
}
