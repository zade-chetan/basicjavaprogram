package Basicprograms;

public class NonStaticMethodOverloading {

	    void add1 ()
		{
			System.out.println("Non parametarized method");
		}
		 void add1 (int a)
		{
			System.out.println("parametarized method with int value");
		}
		 void add1 (String a)
		{
			System.out.println("parametarized method with String value");
		}
		
		 void add1 (double a)
			{
				System.out.println("parametarized method with String value");
			}
	
	
	public static void main(String[] args) {
		
		NonStaticMethodOverloading n1 = new NonStaticMethodOverloading();
		n1.add1();
		n1.add1(78);
		n1.add1("Method overloading");
		n1.add1(3.14);

	}

}
