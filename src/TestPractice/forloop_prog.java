
import java.util.Scanner;
public class forloop_prog {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in); 
		for(int i = 10; i>=0; i-=2) {
			System.out.println(i);
		}
		System.out.println("Happy new year");
        scanner.close();
	}
}
