package JavaCollectionAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Copy_clone_Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> original = new ArrayList<String>();
		original.add("Karnataka");
		original.add("Andhapradesh");
		original.add("Hyderabad");
		original.add("Maharashtra");
		original.add("Chennai");
		
		//using clone method(1)
		Object clonemethod = original.clone();
		
		// creating two arraylists method(2)
		ArrayList<String> clone = new ArrayList<String>(original);
		System.out.println(clonemethod);
		Iterator<String> lt = clone.iterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		
	//Using Assert
		
	//Assert.assertEquals()
		
	}
		
	}


