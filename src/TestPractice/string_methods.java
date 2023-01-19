public class string_methods {
	public static void main(String[] args) {

		String name = "Thomaskutty Reji      "; 
		boolean results = name.equals("Thomaskutty Reji"); 
		System.out.println(results); 
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		
		System.out.println(name.indexOf("a"));
		
		System.out.println(name.isEmpty());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.replace("o","w"));
	}
}