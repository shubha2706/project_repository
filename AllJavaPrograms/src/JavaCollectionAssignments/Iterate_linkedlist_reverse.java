package JavaCollectionAssignments;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iterate_linkedlist_reverse {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		li.add("apple");
		li.add("Bat");
		li.add("cat");
		li.add("Dog");
		li.add("Elephant");
		li.add("Fan");
		li.add("Gate");
		
		java.util.Iterator<String> it = li.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
