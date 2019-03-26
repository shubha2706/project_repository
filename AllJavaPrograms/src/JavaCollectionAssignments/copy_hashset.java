package JavaCollectionAssignments;

import java.util.Collections;
import java.util.HashSet;

public class copy_hashset {

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

hs1.addAll(hs);

System.out.println(hs1);

//using clone method
Object clone = hs.clone();
System.out.println(clone);


	}

}
