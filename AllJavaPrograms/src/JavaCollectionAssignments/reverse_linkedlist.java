package JavaCollectionAssignments;

import java.util.Collections;
import java.util.LinkedList;

public class reverse_linkedlist {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("apple");
		li.add("Bat");
		li.add("cat");
		li.add("Dog");
		li.add("Elephant");
		li.add("Fan");
		li.add("Gate");

		Collections.reverse(li);
		
		System.out.println(li);
	}

}
