package JavaCollectionAssignments;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist_containsAll {

	public static void main(String[] args) {
ArrayList al = new ArrayList();

al.add("Karnataka");
al.add("Andhapradesh");
al.add("Hyderabad");
al.add("Maharashtra");
al.add("Chennai");

LinkedList<String> li = new LinkedList(al);
boolean containsAll = li.containsAll(al);
System.out.println(containsAll);
boolean contains = li.contains("Karnataka");
System.out.println(contains);

	}

}
