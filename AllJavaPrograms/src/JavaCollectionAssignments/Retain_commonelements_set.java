package JavaCollectionAssignments;

import java.util.HashSet;

public class Retain_commonelements_set {

	public static void main(String[] args) {
		HashSet<String>	 hs = new HashSet<String>();

		hs.add("apple");
		hs.add("Bat");
		hs.add("cat");
		hs.add("Dog");
		hs.add("Elephant");
		hs.add("Fan");
		hs.add("Gate");

		HashSet<String>	 hs1 = new HashSet<String>();

		hs1.add("Anil");
		hs1.add("Bhaskar");
		hs1.add("apple");
		hs1.add("Bat");
		hs1.add("cat");
		hs1.add("Dog");
		
		hs.retainAll(hs1);
		
		System.out.println(hs);
		
		hs1.retainAll(hs);
		
		System.out.println(hs1);
		
	}

}
