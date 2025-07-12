package Basicprograms;

public class Ifstatement {

	public static void main(String[] args) {
            
		int a = 20;
		int b = 30;
        int c = 20;
		if (a < b) { // true

			System.out.println("Execute less than");
		}
		if (a > b) // false

		{
			System.out.println("Execute greater than");
	
		}
         if (a <= b) { // true
        	 
        	 System.out.println("Execute less than or equal to");
			
		}
         if (a >=c) { // true
        	 
        	 System.out.println("Execute greater than or equal to");
			
		}
         if (a==b) { // False
			
        	 System.out.println("Execute equal equal to");
		}
		
         if (a != b) { // true 
			System.out.println("Execute Not equal to");
		}
	} 
	
	
}
