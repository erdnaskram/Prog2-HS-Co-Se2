package Vorlesungen.codebeispiele.collection;


import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		for (int i = 0; i < 100 ; i++)
			v.add("" + i);
		
		v.forEach(s -> System.out.println(" [" + s + "]"));
		
		
		
		

	}

}
