package JavaCollectionAssignments;

import java.util.HashMap;

public class SearchKey_map {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Xiaomi");
		hm.put(2, "Lenovo");
		hm.put(3, "Honor");
		hm.put(4, "Asus");
		hm.put(5, "Sony");
	
		
boolean containsKey = hm.containsKey(4);	
System.out.println(containsKey);
	
	}
	
	

}
