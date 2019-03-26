package JavaCollectionAssignments;

import java.util.LinkedList;

public class LinkedList_Array {

	public static void main(String[] args) {
LinkedList<String> li = new LinkedList<String>();
li.add("apple");
li.add("Bat");
li.add("cat");
li.add("Dog");

Object[] array = li.toArray();

for(Object ob:array )
{
	
	System.out.println(ob);
}




	}

}
