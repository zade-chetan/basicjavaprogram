package Basicprograms;

public class StaticMethodOverloading {
    
	
	
	static void add1 ()
	{
		System.out.println("Non parametarized method");
	}
	static void add1 (int a)
	{
		System.out.println("parametarized method with int value");
	}
	static void add1 (String a)
	{
		System.out.println("parametarized method with String value");
	}
	
	
	public static void main(String[] args) {

		add1();
		 add1(3);
		 add1("String");
		
	}

}
