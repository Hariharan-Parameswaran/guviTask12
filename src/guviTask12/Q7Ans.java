package guviTask12;

import java.util.ArrayList;
import java.util.List;

public class Q7Ans {

	public static void main(String[] args) {
		// Create a list of names
		List<String> nameList = new ArrayList<>();
		nameList.add("hari");
		nameList.add("vasu");
		nameList.add("Rohit");
		nameList.add("vinith");

		// Print the list of names
		System.out.println("List : ");
		System.out.println(nameList);

		// Convert the list to an array
		String[] nameArray = new String[nameList.size()];
		nameArray = nameList.toArray(nameArray);

		// Space between line
		System.out.println();

		// Print the array of names
		System.out.println("Array : ");
		for (String listArray : nameArray) {
			System.out.println(listArray);
		}
	}

}

// Output :
//	 List : 
//		 [hari, vasu, Rohit, vinith]
//
//		 Array : 
//		 hari
//		 vasu
//		 Rohit
//		 vinith
