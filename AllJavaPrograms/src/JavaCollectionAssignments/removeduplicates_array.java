package JavaCollectionAssignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeduplicates_array {

	public static void main(String[] args) {

		Integer arr[] = {1,2,3,4,5,3,3,4,4,5};
		
		List<Integer> asList = Arrays.asList(arr);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		boolean addAll = hs.addAll(asList);
		
		Object[] array = hs.toArray();
		
		for(Object elements:array)
		{
			System.out.println(elements);
		}
		
		
	}

}
