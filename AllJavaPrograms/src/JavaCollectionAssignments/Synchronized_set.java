package JavaCollectionAssignments;

import java.util.HashSet;
import java.util.Set;

public class Synchronized_set {

	public static void main(String[] args) {
Set<String> s = new HashSet<String>();
s.add("poori");
s.add("Saagu");
s.add("Idli");

Set<String> s1= new HashSet<String>(s);

System.out.println(s);

	
	}

}
