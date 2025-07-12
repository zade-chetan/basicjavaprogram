package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty3 {

	public static void main(String[] args) {
		
		// this is the collection which can store all the String value in it.
		Collection <String> c1 = new ArrayList <String> ();
		c1.add("MKT");
		c1.add("Manasa");
		c1.add("Padma");
		c1.add("Anand");
		c1.add("pavan");
		System.out.println(c1);
		
		// this is the collection which can store all the Integer value in it.
		Collection <Integer> c2 = new ArrayList <Integer> ();
		c2.add(74);
		c2.add(85);
		c2.add(96);
		c2.add(52);
		c2.add(85);
		System.out.println(c2);
		
		Collection <Boolean> c3 = new ArrayList <Boolean> ();
		c3.add(true);
		System.out.println();
		
	}

}
