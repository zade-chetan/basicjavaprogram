package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty {

	public static void main(String[] args) {
		
		// object is String
		Set<String> s1 = new HashSet<String>();
		s1.add("rama");
		s1.add("anupa");
		s1.add("josna");
		s1.add("kartik");
		s1.add("rama");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		

		// returen type of iterator --->Iterator of object
		Iterator<String> i1 = s1.iterator();

while(i1.hasNext())
{
	System.out.println(i1.next());
}


	}

}
