package Basicprograms;

import java.util.Scanner;

public class ScannerClass_3{

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);
		
		String str1 = s1.next("Chrome browser");
		System.out.println(str1);
		String str2 = s1.next("edge browser");	
		System.out.println(str2);
		s1.close();
		
	}

}
