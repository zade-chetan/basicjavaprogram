package Basicprograms;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Nonstatic {
   
	
	// Tech fully youtube channel
	// Diff between static and Non static 
	// Static / Non static variable not present inside the method, It is present outside the method
	// Static / Non static variable we can used access specifier
	
	// static/ Non static variable can be utilized without initialize.
	// as it takes by default zero only for integer only if you not initialize it
	 public int a ; // non static or instances or Global variable
	// with the help of object a value is initialize .
	// Now a=6;
	
	//public static int b ;// static
	
	
	public static void main(String[] args) {
		
		Nonstatic n1 = new Nonstatic();
		// StaticandNonstatic ---> Class name
		// n1 --->refrence it create object
		//new ---it create memory space
		//StaticandNonstatic()-->constructor name should be same as class name oly i am giving the parenthesis as it is an object
		
		// to used the non static variable then with the help ref we can call 
		n1.a = 6; // here I have call it and assign it
		
		Nonstatic n2 = new Nonstatic();
		n1.a = 7;
		
		// Mean whenever you are creating new object , that new instance or non static  variable is created .
		// once the object work is end then instance or non static  variable also end .
		System.out.println(n1.a +"  "+ n2.a );
	}

}

// Note : -
