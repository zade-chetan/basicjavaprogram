package Basicprograms;

public class SwitchCaseprogram1 {

	public static void main(String[] args) {
       
		
		// break :- with the help of break it will stop the execution ,terminate the program , it will not allow to execute case 2
		// for ex :- 2 in switch :- it will not allow to execute case 2
		
		// It is not mandatory to write the break and default ---> it your choice
      // Whatever the logic you will write in switch , that case only execute
		
		// if u give 1000 --> do we have any matching case -- No--> then it will execute the default
		// default --> will execute if there no matching case
		// default ---> if nothing means default
		//switch (10000) {
		switch(1) {
        
        case 1 : System.out.println("Chrome browser");
        break;
        
        case 2 : System.out.println("Edge browser");
        break;
        
        case 3 : System.out.println("IE browser");
        break;
        
        case 4 : System.out.println("Safari browser");
        break;
        
        case 5 : System.out.println("firefox browser");
       break;
        
   default : System.out.println("Sorry but your selection is Wrong");
        }

}
}
