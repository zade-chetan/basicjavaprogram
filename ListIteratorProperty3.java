package Collection;
// This Concept learn from Coding seeko 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProperty3 {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<>();
		a1.add("C");
		a1.add("C++");
		a1.add("DSA");
		a1.add("JAVA");
		a1.add("phyton");
		a1.add("HTML");

	System.out.println(a1);

		ListIterator<String> i1 = a1.listIterator(); // Abhi Jo Power hai Vo (i1) ke pass hai
                              
while (i1.hasNext()) 
		{
			String name =i1.next();
		

		    if (name.equals("JAVA")) 
		    {
           // Why I use  all the set , add and remove are the function of listIterator
			i1.set("Core Java"); 

		    }

		    else if (name.equals("phyton")) // else if --> means yaddi or Ya fhir
		    {
			i1.add("PHP"); 

		    }

		    else if (name.equals("HTML")) 
		    {
			
            i1.remove();
	        }
		    
		    
      
}
int   k =   i1.nextIndex();	  
System.out.println(k); 
System.out.println("Updated set of value"+a1);
}
}