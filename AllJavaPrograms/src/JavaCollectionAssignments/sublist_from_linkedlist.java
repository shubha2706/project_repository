package JavaCollectionAssignments;

import java.util.LinkedList;
import java.util.List;

public class sublist_from_linkedlist {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		li.add("apple");
		li.add("Bat");
		li.add("cat");
		li.add("Dog");
		li.add("Elephant");
		li.add("Fan");
		li.add("Gate");

List<String> subList = li.subList(2, 6);	

System.out.println(subList);
	}

}
