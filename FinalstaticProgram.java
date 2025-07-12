package Basicprograms;

public class FinalstaticProgram {

	
		static double pi = 3.14;
		
		
		static void admission(int age) {
		
		 if ( age >=6)
		{
			System.out.println("Student is eligible to join 1st class");
		}
		 else if (age>=4)
			 
		 {
			 System.out.println("Student is eligible to join LKG");
		 }
	     
		 else if (age>=3) {
			 
			 System.out.println("Student is eligible to join play school");
		 }
		 
		}
		public static void main(String[] args) {
			
			pi=5;
			admission(4);
		}
		
		}


