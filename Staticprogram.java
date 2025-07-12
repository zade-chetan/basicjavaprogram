package Basicprograms;

public class Staticprogram {

	
	
	
	static int a;// Static variable OR Class variable-->  called by object creation
	
	public static void main(String[] args) {
		
		Staticprogram n1 = new Staticprogram();
		
		n1.a=6;
		
		Staticprogram n2 = new Staticprogram();
		
		n2.a=7;
		
		System.out.println(n1.a +"  " + n2.a);
		
// Non static---> Jitne br object banao ge utne br new instance variable create hoga.
		
// Static ---> Jitne br object banao ge vo ek hi memory lega aur bhi updated value lega , he will take updated value only

		// classname.variablename;
	   n1.a=6;
	   n2.a=7;
	   // it will always take updated value
	   System.out.println(n1.a +"  " + n2.a);
	   
	
	}

}
