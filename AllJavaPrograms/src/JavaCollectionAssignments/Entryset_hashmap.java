package JavaCollectionAssignments;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Entryset_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Xiaomi");
		hm.put(2, "Lenovo");
		hm.put(3, "Honor");
		hm.put(4, "Asus");
		hm.put(5, "Sony");
	
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		
		for(Entry<Integer,String> en:entrySet)
		{
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println(key+":"+value);
		}
	}

}
