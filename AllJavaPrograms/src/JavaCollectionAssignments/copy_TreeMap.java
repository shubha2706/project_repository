package JavaCollectionAssignments;

import java.util.TreeMap;

public class copy_TreeMap {

	public static void main(String[] args) {

		
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		tm.put(1, "Family");
		tm.put(2, "Career");
		tm.put(3, "Marriage");
		tm.put(4, "Relatives");
		
		TreeMap<Integer,String> tm1= new TreeMap<Integer,String>(tm);
		
		String keyvalue = tm1.get(1);
		System.out.println(keyvalue);

		
	}
	

}
