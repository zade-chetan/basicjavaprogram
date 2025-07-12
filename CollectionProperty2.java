package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty2 {

	public static void main(String[] args) {
		
		      // here I have done upcasting  from arraylist to collection
		// Object/ parent class    =      Child class     
		Collection  c1  = new ArrayList();
		
		 // Can you see all the method a is written that represent it is Abstract method
		// of which interface ---> collection interface
		// parameter of add is an object
		c1.add("MKT"); // object mean you can add anything
		c1.add(8577);
        c1.add(85.36);
        c1.add('M');
        c1.add(true);
        
        // Above all the data are Hetrogenius data.
        // we can store dynamic value
        
        System.out.println(c1);
      
        // clear --> means make it empty or clear it 
      // c1.clear();
        
        System.out.println("After clear--->"+c1);
        
        // Any method start with is , have , has ---> return type boolean
        
     System.out.println(c1.isEmpty());
	
	System.out.println("------------------------------");
	
	Collection  c2  = new ArrayList();
	
	c2.add("Akash"); // object mean you can add anything
	c2.add(7458);
	c2.add(65);
    c2.add('A');
    c2.add(false);
    
    // You can write it 
    System.out.println(c2);
    
    
    // Now I will Show you addAll method
    // addAll parameter comes with Collection
    
    // Question --AS OF hOW MANY COLLECTION i HAVE MADE ready ?
    // Ans - two collection are ready c1 and c2
    
   c2.addAll(c1); // It means I want to add entire c1 into c2 .
    System.out.println(c2);
	
    System.out.println("--------Contains method ----------");
	System.out.println(c2.contains("Akash"));//  it will check that particular attribute present or not.
	// return type of contains method --> boolean
	System.out.println(c2.contains("Jyoti")); // jyoti is not present it give me false
	
	// containsAll ---> here I have to check if c1 is a part of c2 or not
	// containsAll ---> return type --> boolean
	System.out.println(c2.containsAll(c1));
   
	 System.out.println("--------remove method ----------");
	c2.remove('M');
	System.out.println("Updated C2 -->"+c2);
	c2.removeAll(c1); // I want to delete the entire c1 from c2
	System.out.println("Updated C2 -->"+c2);
	
	boolean b1 = c2.equals(c1);// Here I checking if my c1 equal c2
	// checking the both the collection are same or not
	// return type equal method --> boolean
	System.out.println(b1);
	
	c2.size(); // it will give how many element are present on it
	System.out.println(c2);
	}

}
