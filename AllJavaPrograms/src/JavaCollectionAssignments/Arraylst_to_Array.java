package JavaCollectionAssignments;

import java.util.ArrayList;

public class Arraylst_to_Array {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Karnataka");
		al.add("Andhapradesh");
		al.add("Hyderabad");
		al.add("Maharashtra");
		al.add("Chennai");
		
		Object[] arrayobj = al.toArray();
		
		
		for(Object ob:arrayobj)
		{
			System.out.println(ob);
		}
		

		//using get method
		String[] arraystring = new String[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			arraystring[i] = al.get(i);
			
		}
		
		for(String elements:arraystring)
		{
			System.out.println(elements);
		}
		
	}

}
