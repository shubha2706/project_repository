package JavaCollectionAssignments;

import java.util.TreeSet;

public class FIndDuplicate_array {
	
	public static void main(String[] args) {
		
Integer arr[] = {1,2,3,4,5,3,3,4,4,5};
		
for(Integer ele:arr)
{
	System.out.println(ele);
}

TreeSet<Integer> ts = new TreeSet<Integer>();
for(Integer ele:arr)
{
	if(!ts.add(ele))
	{
		System.out.println("Duplicate:"+ele);
	}
	

}
		
		
		//method 2
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
		
	}

}
