package Basicprograms;

public class LogicaloperatorP2 {

	public static void main(String[] args) {
		
		System.out.println("Logical OR operator...");
		// || --> It evaluate to true at least one the condition is true .
		/* Example : 1
		boolean a= true;
		boolean b = false;
		boolean c = false ;
		
		 if(a || b || c)
		 {
			 System.out.println("y");
			 
		 }
		 else
			 
		 {
			 System.out.println("N");
		 }
         */
		 
		// Example 2 
		
		int a = 10 ;
		int b = 2;
		
		if (a>b || b <a)
			
		{
			System.out.println("Going Inside the if Block");
		}
		else
		
		{
			System.out.println("Not going Inside the if Block");
		}
		
		 
	}

}
