import java.util.ArrayList; 
public class arraylist {
	public static void main(String[] args) {

	/* Arraylist - resizable array, 
	 *             elements can be added and removed
	 *             store reference data types 	
	 */
	ArrayList<String> food = new ArrayList<String>();
	food.add("pizza"); 
	food.add("burger");
	food.add("hotdog"); 

	
	food.set(1,"sushi");
	food.remove(0); 
	// food.clear(); 
	System.out.println(food);
	for(int i=0; i<food.size(); i++) {
		System.out.println(food.get(i));
	}
	}
}