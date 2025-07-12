package Basicprograms;

public class MixedGlobalandLocalvariable {

	int a ; // Instance or Global variable or Non static variable
	
	
	//Global variable --> it is  present outside the method and present inside the class
	// Global variable can be utilized without initializing. as it default value o.
	// if we have call global variable then we have to create the object of that class.
	// then create the object in main method.then call it.
	
	public static void main(String[] args) {
	
		
		MixedGlobalandLocalvariable m1 = new MixedGlobalandLocalvariable();
	    int a = 6; // local variable --> which is present inside the method.
	
	
     System.out.println(a);
     System.out.println(m1.a);
	}

}


 // Note :- 1st priority is given to local variable to execute.
 // 2nd priority is given to global variable execute.

