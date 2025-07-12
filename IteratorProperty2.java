package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorProperty2 {

	

	public static void main(String[] args) {
		
		List <String> name = new ArrayList <String>();
		name.add("Alice");
		name.add("Bob");
		name.add("Charlie");
		name.add("David");
		name.add("Eve");// It accept duplicate
		
        
	    System.out.println(name);
	                  Iterator<String> i1  = name.iterator();
	                 
	                 
while(i1.hasNext()) //boolean --->  It will check the next element is present or not
	            	// hasNext ---> Only give true or false	   
{
	            	  // Alice is present then print it 
	            	   //Bob is present then print it 
	            	   //Charlie is present then print it 
	            	 // next ---> if element is present it will give me that element
	            	      String value = i1.next(); // object --->it read the data
	            	         
	            	          // Below code is for remove 
	            	      if (value.equals("David"))// jo bhi value vo return kr raha hai agar vo value equal Raajita se then it remove
	            	      {
	            	    	  
	            	    	 i1.remove(); // It remove the data
	            	    	 
	            	
	            	    	  
	            	    	  
	            		   }   
	            	         
	   	
}
	            
	            	 System.out.println(name);               
	}       
}

