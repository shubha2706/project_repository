package JavaCollectionAssignments;

import java.util.HashMap;

public class copy_hashmap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Xiaomi");
		hm.put(2, "Lenovo");
		hm.put(3, "Honor");
		hm.put(4, "Asus");
		hm.put(5, "Sony");
		
		HashMap hm1 = new HashMap();
		hm1.put(6, "Intex");
		hm1.put(7,"Eureka");
		
		hm1.putAll(hm);
		
		System.out.println(hm);
		System.out.println(hm1);

		

	}

}
