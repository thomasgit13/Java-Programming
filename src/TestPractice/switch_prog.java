import java.util.Scanner ; 
public class switch_prog {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the day name: ");
		
		String day = scanner.nextLine(); 
		scanner.close();
		
		switch(day) {
			case "Sunday": System.out.println("It is sunday");
			break; 
			
			case "Monday": System.out.println("It is monday");
			break; 
			case "Tuesday": System.out.println("It is tueday");
			break; 
			case "Wednesday": System.out.println("It is wednesday");
			break; 
			case "Thursday": System.out.println("It is thursday");
			break; 
			case "Friday": System.out.println("It is friday");
			break; 
			case "Saturday": System.out.println("It is saturday");
			break; 
			
			default: System.out.println("That is not a day");
		}
	}
}