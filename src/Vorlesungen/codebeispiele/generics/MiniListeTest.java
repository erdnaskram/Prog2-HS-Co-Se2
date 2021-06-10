package Vorlesungen.codebeispiele.generics;

public class MiniListeTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Untypisierte Verwendung: heterogene Elementtypen
		@SuppressWarnings("rawtypes")
		MiniListe l1 = new MiniListe(10);

		l1.addElement("hello");
		l1.addElement("world");
		
		for (Object o : l1)
			System.out.println(o);

		// Ganzzahlige Typisierung: homogene Elementtypen
		MiniListe<Integer> l2 = new MiniListe<Integer>(5);
		l2.addElement(3);
		l2.addElement(1);
		l2.addElement(4);

		for (Integer i : l2)
			System.out.println(i + 1000);

	}
}
