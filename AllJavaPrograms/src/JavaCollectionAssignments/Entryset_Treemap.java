package JavaCollectionAssignments;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Entryset_Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		tm.put(1, "Family");
		tm.put(2, "Career");
		tm.put(3, "Marriage");
		tm.put(4, "Relatives");
		
		
	
		Set<Entry<Integer, String>> EntrySet = tm.entrySet();
		
		for(Entry<Integer, String> entry:EntrySet)
		{
			String value = entry.getValue();
			System.out.println(value);
			
			Integer key = entry.getKey();
			System.out.println(key);
		}
		

	}

}
