package JavaCollectionAssignments;

import java.util.NavigableSet;
import java.util.TreeMap;

public class reverse_keys_treemap {

	public static void main(String[] args) {

		
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		tm.put(1, "Family");
		tm.put(2, "Career");
		tm.put(3, "Marriage");
		tm.put(4, "Relatives");
		tm.put(5, "Friends");
		tm.put(6, "you");
		
		NavigableSet<Integer> descendingKeySet = tm.descendingKeySet();
		System.out.println(descendingKeySet);
	}

}
