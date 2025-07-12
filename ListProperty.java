package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListProperty {

	public static void main(String[] args) {
		
		// Now I have to upcasting ArrayList to List
		    List <String>    c1   =   new ArrayList<String> ();
		    
		    c1.add("Pooja");
		    c1.add("Poornima");
		    c1.add("Naresh");
		    c1.add("Raajita");
		    c1.add("Pooja");
		    c1.add(null);
		   // at index position 0 i want to add Rahi.
		    //Below method is available in List not on Collection
		    c1.add(0, "Rahi");
		    
		    System.out.println(c1);
		  
		    System.out.println("---------------------------------");
		    List <String>    c2   =   new ArrayList<String> ();
	         c2.add("Jyoti");
	         c2.add("Manasa");
	         // It will add the entire c1 into c2
	         c2.addAll(c1);
	         System.out.println(c2);
	         System.out.println("---------------------------------"); 
	        
	        
	    
	         // Below method is used to add the collection at a given index
	         // Simply at index position Zero , I can add my C1
	         // c1 at the starting and C2 at the end
	         // means you added entire c1 into c2 now
	         c2.addAll(0, c1);
	         System.out.println(c2);
	
	         System.out.println("---------------------------------"); 
	         // remove the object at the given index
	         c2.remove(0);
	         System.out.println(c2);
	         
	         // it will fetch the data from indexing five
	         System.out.println( c2.get(5)); // this method used in Selenium mostly
	         
	         System.out.println(c2);
	         
	         System.out.println("------Duplicate or not---------");
	          
	         // It accept duplicate
	         // It accept NULL
	  
	          
	
	}

}
