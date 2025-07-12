package Basicprograms;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		
	//	Scanner s1 = new Scanner (); // Giving compile time error because there are no 
		// non Parameterized constructor present in scanner class
		
		// Scanner having the Parameterized in it
		// Once you hover it u can see total 16 parametarized constructor is present here.
		// That's why when you creating the Object of Scanner class with No parameter is Show Compile error
		
		Scanner s1 = new Scanner (System.in);
		// System.in ---> It accept the human input at runtime now.
		// System.out ---> It give the output
		
		// Now My goal is to call the non static, we call with help of reference variable
		// Scanner class has lot of method in it
		
		// The purpose of this method will accept the variety of data.
		
		String input = s1.next(); //it accept string value
		int i = s1.nextInt();//int
		
		byte b = s1.nextByte();//Byte
		float f = s1.nextFloat();//Float
		long l = s1.nextLong();//Long
		boolean t = s1.nextBoolean();//Boolean
		short s = s1.nextShort();//Short()
		double d = s1.nextDouble();//Double
		
		s1.close();
		
		
		// This is How it accepted the human input at runtime.
		// By seeing this program I am getting the yellow error in line of code
		// You can hover over ---> It is saving that s1 is never close.
		// Whenever you using the scanner class --> u have to close it
		// Once you close it will stop accepting the human input now.
		// if don't do also you will not face any problem like Compile and Runtime error
		
		// Yellow means --- not used in the program
		
		
		
		

	}

}
