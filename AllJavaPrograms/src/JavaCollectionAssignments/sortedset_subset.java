package JavaCollectionAssignments;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset_subset {

	public static void main(String[] args) {

		
		SortedSet ts = new TreeSet();
		
		ts.add("Zebra");
		ts.add("Yak");
		ts.add("volatile");
		ts.add("Tubelight");
		ts.add("Umbrella");
		ts.add("egg");
		
	ts.subSet(2, 5);
		
		System.out.println(ts);
	}

}
