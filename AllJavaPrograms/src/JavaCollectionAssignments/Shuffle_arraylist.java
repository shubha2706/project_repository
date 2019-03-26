package JavaCollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Shuffle_arraylist {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Karnataka");
		al.add("Andhapradesh");
		al.add("Hyderabad");
		al.add("Maharashtra");
		al.add("Chennai");
		
		//Collections.shuffle(al);
		Collections.shuffle(al, new Random(3));
		System.out.println(al);
		
		for(String elements:al)
		{
			System.out.println(elements);
		}
		
	

	}

}
