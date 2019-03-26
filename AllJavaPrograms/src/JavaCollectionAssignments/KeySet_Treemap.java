package JavaCollectionAssignments;

import java.util.Set;
import java.util.TreeMap;

public class KeySet_Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		tm.put(1, "Family");
		tm.put(2, "Career");
		tm.put(3, "Marriage");
		tm.put(4, "Relatives");
	
		
		Set<Integer> keySet = tm.keySet();
		System.out.println(keySet);
	}

}
