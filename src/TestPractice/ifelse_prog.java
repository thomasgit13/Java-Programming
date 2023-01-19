import java.util.Scanner ; 
public class ifelse_prog {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your age: "); 
		int age = scanner.nextInt(); 
		if (age>=18) {
		System.out.println("you are an adult");
		}
		else if(age==15){
			System.out.println("not sure");
		}
		else {
			System.out.println("You are not an adult");
		}
        scanner.close();
	}
}
