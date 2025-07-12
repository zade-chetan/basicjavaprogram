package Basicprograms;

public class ConstructorOverloading {

	
	ConstructorOverloading()
	{
		System.out.println("Non parametarized constructor");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("parametarized constructor with int value");
	}
	ConstructorOverloading(String a)
	{
		System.out.println("parametarized constructor with String value");
	}
	
	ConstructorOverloading(String a , String b)
	{
		System.out.println("parametarized constructor with both String value");
	}
	
	ConstructorOverloading(double d , char c)
	{
		System.out.println("parametarized constructor with double and char");
	}
	
	
	
	public static void main(String[] args) {
		
		new ConstructorOverloading();
		new ConstructorOverloading(2);
		new ConstructorOverloading("Surname");
		new ConstructorOverloading("Surname" , "Name");
		new ConstructorOverloading(3.14 , 'A');
	}
	      
	      
	
	

}
