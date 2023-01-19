import java.util.Scanner;
import java.util.Arrays;
public class array {

	// method for finding min of an array 
	static double[] min_max(double arr[]){ 

		double result[] = {arr[0],arr[0]};

		for(int i=1;i<arr.length;i++){ 
			if(result[0]>arr[i]){
				result[0]=arr[i]; 
			} ;
			if(result[1]<arr[i]){
				result[1] = arr[i]; 
			}; 
		}
		return result; 
	}

	//creating a method which receives an array as a parameter  
	static void printArray(int arr[]){  
		System.out.println(Arrays.toString(arr));  
	}  
	
	// main method 
    public static void main(String[] args) {
		String[] cars = {"Camero", "Corvette","Tesla"}; 
		cars[0] = "Mustang"; 
		System.out.println(cars[2]);
		System.out.println("----------Logging Car Names--------------");
		
		for (int i= 0; i<cars.length; i++){
			System.out.println(cars[i]);
		}; 

		System.out.println("----------Logging Bikes Names--------------"); 
		// another method 
		String[] bikes = new String[3]; 
		bikes[0] = "Honda"; 
		bikes[1] = "R15"; 
	    bikes[2] = "Ninja"; 
	    
	    for(int i =0; i<bikes.length; i++) {
	    	System.out.println(bikes[i]);
	    }; 	

		// integer array 
		double[] ages = {25.1,27,37,42,23,23}; 
		System.out.println(Arrays.toString(ages));

		// float array 
		double[] heights = {170.2,180.4,174.7,194.2,188.2}; 
		for (double element:heights){
			System.out.println(element);
		}
		System.out.println(Arrays.toString(heights));

		// min max of ages 
		double minmax_ages[] =  min_max(ages);
		System.out.println(Arrays.toString(minmax_ages));

		// min max of heights 
		double minmax_heights[] = min_max(heights); 
		System.out.println(Arrays.toString(minmax_heights));

		// printing array by directly passing to a function 
		printArray(new int[]{2,3,5,20,401,389});
	}
}

