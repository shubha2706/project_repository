package JavaCollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_elements_arraylist {

	public static void main(String[] args) {
		
ArrayList<String> al = new ArrayList<String>();
		
		al.add("Karnataka");
		al.add("Andhapradesh");
		al.add("Hyderabad");
		al.add("Maharashtra");
		al.add("Chennai");
		
		Collections.swap(al, 2, 3);
		System.out.println(al);

	}

}
