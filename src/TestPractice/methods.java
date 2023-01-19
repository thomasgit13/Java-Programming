import java.util.*; 
public class methods {
	public static void main(String[] args) {
		// method - a block of code that is executed whenever it is called
		String name1= "Thomaskutty"; 
		String name2= "Maria";
		int age1 = 32; 
		int age2 = 23; 
		
		hello(name1, age1); 
		hello(name2,age2); 
	}
	
	static void hello(String name, int age) {
		System.out.println("Hello "+ name);
		System.out.println("You are "+ age+" years old");
	}	
}