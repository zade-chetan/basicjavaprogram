package Basicprograms;

import java.util.Scanner;

public class Scanner_Class2 {

	public static void main(String[] args) {

          
		Scanner s1 = new Scanner (System.in);// After creating the object of scanner class 
		// Then I am going to import it ,by passing the argument systen .in --> system . input
		
		// Then call non static method
		// 1st nextint will  going to accept my first input a  
		System.out.println("Enter the value of a");
		      int a = s1.nextInt();
		      
		      System.out.println("Enter the value of b");      
		      int b = s1.nextInt();
		      
		      int sum = a+b;
		      
		      System.out.println("The sum of 2 no.");
		      
		      System.out.println(sum);
		      
		      s1.close();
		      
		  
		

	}

}
