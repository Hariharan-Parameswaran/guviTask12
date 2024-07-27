package guviTask12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Q6Ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a TreeMap and add employee names with their IDs
		TreeMap<Integer,String> emplist = new TreeMap<Integer,String>();
		emplist.put(1,"Sethu");
		emplist.put(2, "Vasu");
		emplist.put(3, "Rohit");
		emplist.put(4, "Vinith");
		emplist.put(5, "Hari");
		
		//Create a collection of employee names
		Collection<String> emNames = emplist.values();
		List<String> accName =new ArrayList<>(emNames); // Convert the collection to a list
		Collections.sort(accName);
		
		 // Print the sorted list of names
		System.out.println("Employees Name list : ");
		for(String name : accName) {
			System.out.println(name);
		}
		
	}

}

// Output :
//	 Employees Name list : 
//		 Hari
//		 Rohit
//		 Sethu
//		 Vasu
//		 Vinith
