package Vorlesungen.codebeispiele.predicatesexample;

import java.util.function.Predicate;

public class PredicateLambda {

	public static void main(String[] args) {
		
		boolean outcome;
		
		// Drei Beispiel Texte
		String text1 = "The 2014 Winter Olympics, officially "
	            + "known as the XXII Olympic Winter Games, "
	            + "is a major international multi-sport "
	            + "event currently being held in Sochi, "
	            + "Russia, in the tradition of the " + "Winter Olympic Games";
		
		String text2 = "Hello World: this is Java 8!";
		String text3 = "Hello";
		
		// Beispiel Pr�dikate
		Predicate<String> containsLetterO			= p -> p.contains("O");
		Predicate<String> hasLengthGreaterThan10 	= p -> p.length() > 10; 
		Predicate<String> startsWithHello			= p -> p.startsWith("Hello"); 
		
		//Wende contains Pr�dikat auf Beispiel Strings an
		System.out.println("text 1: containsO Predicate:" +containsLetterO.test(text1));
		System.out.println("text 2: containsO Predicate:" +containsLetterO.test(text2));
		System.out.println("text 3: containsO Predicate:" +containsLetterO.test(text3));
		
		// Pr�dikate aus vordefinierten Logischen-Methoden zusammensetzen
		
		// Pr�fe, ob der String l�nger als 10 ist UND den Buchstabe O enth�lt ODER mit Hello beginnt
		outcome = hasLengthGreaterThan10.and(containsLetterO).or(startsWithHello).test(text1);
		System.out.println("text 1: ((length > 10) && containsO) || startsWith Hello) " + outcome);
		
		outcome = hasLengthGreaterThan10.and(containsLetterO).or(startsWithHello).test(text2);
		System.out.println("text 2: ((length > 10) && containsO) || startsWith Hello) " + outcome);
		
		outcome = hasLengthGreaterThan10.and(containsLetterO).or(startsWithHello).test(text3);
		System.out.println("text 3: ((length > 10) && containsO) || startsWith Hello) " + outcome);
		
		
		// der letzte Block geht auch viel kompakter und lesbarer
		Predicate<String> thePredicate = hasLengthGreaterThan10.and(containsLetterO).or(startsWithHello);
		System.out.println("\nUnd jetzt der gleiche Block kompakter im Code");
		System.out.println("text 1: ((length > 10) && containsO) || startsWith Hello) " + thePredicate.test(text1));
		System.out.println("text 2: ((length > 10) && containsO) || startsWith Hello) " + thePredicate.test(text1));
		System.out.println("text 3: ((length > 10) && containsO) || startsWith Hello) " + thePredicate.test(text1));

	}

}
