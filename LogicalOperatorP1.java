package Basicprograms;

public class LogicalOperatorP1 {

	public static void main(String[] args) {
		
		System.out.println("Logical AND operator...");
		
		// && --> It evaluate to true if both the condition is true .
		/*
		
		boolean a= true;
		boolean b = false;
		boolean c = false ;
		
		 if(a && b && c)
			 
			 // First a and b evaluate then  (a and b) ka Result c se evaluate hoga. 
		 {
			 System.out.println("y");
			 
		 }
		 else
			 
		 {
			 System.out.println("N");
		 }
         */
		
		int a = 10 ;
		int b = 2;
		
		if (a>b && b >a)
			
		{
			System.out.println("Going Inside the if Block");
		}
		else
		
		{
			System.out.println("Not going Inside the if Block");
		}
	}

}
