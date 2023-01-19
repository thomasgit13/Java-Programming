import java.util.*; 
public class return_types {
	public static void main(String[] args) {
		int x = 23; 
		int y = 21; 
		int z = add(x,y); 
		System.out.println(z);
	}
	
	static int add(int x, int y) {
		int z = x+y; 
		return z ; 
	}
}