package Vorlesungen.codebeispiele.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		boolean notEmpty = true;
		Stack s = new Stack();

		s.push("Erstes Element");
		s.push("Zweites Element");
		s.push("Drittes Element");
		while (notEmpty) {
			try {
				if (!s.empty())
					System.out.println(s.pop());
				else
					notEmpty = false;
					
			} catch (Exception e) {
            }
		}
	}
}
