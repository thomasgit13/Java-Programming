

import java.util.Scanner;
public class logical_operators {
	public static void main(String []args) {

		// temperature verification 
		int temp = 34; 
		if(temp>30) {
			System.out.println("It is hot outside");

		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
		
		
		
		// age verification 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your age: ");
		int age = scanner.nextInt(); 
		
		if (age<20 || age > 50) {
			System.out.println("You are not eligible");
		}
		else {
			System.out.println("You are eligible");
		}
	}
}
