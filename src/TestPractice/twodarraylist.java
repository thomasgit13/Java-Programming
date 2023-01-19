import java.util.*; 
public class twodarraylist {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList(); 
			
		ArrayList<String> bakeryList = new ArrayList(); 
		bakeryList.add("pasta"); 
		bakeryList.add("garlic bread"); 
		bakeryList.add("donuts"); 
		
		ArrayList<String> productList = new ArrayList(); 
		productList.add("tomato"); 
		productList.add("garlics"); 
		productList.add("pepper");
		
		ArrayList<String> drinksList = new ArrayList(); 
		drinksList.add("cola"); 
		drinksList.add("fizz"); 
		drinksList.add("mazza"); 
		
		
		
		groceryList.add(bakeryList); 
		groceryList.add(drinksList); 
		groceryList.add(productList); 
		
		System.out.println(drinksList);
		System.out.println(productList);
		System.out.println(bakeryList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(1).get(1));
	}
}