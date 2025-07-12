package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty1 {

	public static void main(String[] args) {
		
	List <String> c1 = new ArrayList <String>();
		c1.add("Pooja");
	    c1.add("Poornima");
	    c1.add("Naresh");
	    c1.add("Raajita");
	    c1.add("Pooja");// It accept duplicate
	    c1.add(null);// It accept null.
	    c1.add(null);// It accept multiple null value because it accept duplicate
	    
	    System.out.println(c1);
	  
	    System.out.println("-------------------------");
	     Iterator<String> i1 = c1.iterator();
	     
	     // hasnext --> boolean --> whether next element is present or not
	     // next ---> object --> give you that element
          
	     System.out.println("Iteration using Iterator(I)");
	     while (i1.hasNext())// it will check element is present or not
	     {
	    	 
	    	 System.out.println(i1.next()); // it can read the method by using next method  or give you that element
	     }
	
	     System.out.println("------------------------"); 
	     
	     System.out.println("Iteration using ListIterator(I)");
	     
	     ListIterator<String> i2 = c1.listIterator(); // import it in java util package
	            //Total 4 method -->  next , previous ,hasnext , hasprevious
	      // hasnext --> boolean --> whether next element is present or not
	      // hasprevious --> boolean --> whether previous element is present or not
	      // next --> it give next element.
	      // previous --> it give previous element.
	
	     System.out.println("Using Next method");
	       while (i2.hasNext()) {
	    	   
	    	   System.out.println(i2.next());
	         
	       }
	  
	       System.out.println("Using Previous method");      
while (i2.hasPrevious()) {
	    	   
	    	   System.out.println(i2.previous());
	     
	       }
	}

}
