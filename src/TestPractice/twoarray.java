public class twoarray {
	public static void main(String[] args) {
		String[][]  cars = {	{"Camero","corvette","simverado","mandir"},
						   		{"maend","cotte","verado","verna"},
						   		{"cn2","eo1","forum","meir"}
						   };
		for(int i = 0; i<cars.length; i++){
			System.out.println();
			for(int j=0; j<cars[i].length; j++){
				System.out.print(cars[i][j]+" | ");
			}
		}
	}
}
