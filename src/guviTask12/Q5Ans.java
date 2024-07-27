package guviTask12;

import java.util.ArrayList;

public class Q5Ans {

	public static void main(String[] args) {
		// Create a new ArrayList of Strings to store student names
		ArrayList<String> students = new ArrayList<String>();
		students.add(0, "hari");
		students.add(1, "Rohit");
		students.add(2, "vasu");

		// Print the list of students
		System.out.println(students);

		// Remove all elements from the list
		students.removeAll(students);

		// Print the list of students after removing all elements
		System.out.println(students);
	}

}

// Output :
//       [hari, Rohit, vasu]
//       []
