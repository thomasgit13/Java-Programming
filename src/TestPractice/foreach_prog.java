import java.util.*; 
public class foreach_prog {
	public static void main(String[] args) {
		
		String[] anims = {"cat","dog","rat","bird"};
		for(String i: anims) {
			System.out.println(i); 		
		}
		
		System.out.println("--------------------");
		ArrayList<String> animals = new ArrayList<String>(); 
		animals.add("cat"); 
		animals.add("dog");
		animals.add("rat"); 
		for (String i : animals) {
			System.out.println(i);
		}	
	}
}
