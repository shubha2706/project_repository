package JavaCollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Synchronized_list {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();
		
		ls.add("Kannada");
		ls.add("English");
		ls.add("Hindi");
		
		List<String> ls1=Collections.synchronizedList(ls);
		System.out.println(ls1);
	}

}
