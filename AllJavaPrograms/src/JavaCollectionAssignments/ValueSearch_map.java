package JavaCollectionAssignments;

import java.util.HashMap;

public class ValueSearch_map {

	public static void main(String[] args) {

		
		HashMap hm = new HashMap();
		hm.put(1, "Xiaomi");
		hm.put(2, "Lenovo");
		hm.put(3, "Honor");
		hm.put(4, "Asus");
		hm.put(5, "Sony");
	
		
boolean containsValue = hm.containsValue("Asus");	
System.out.println(containsValue);
	}

}
