

import java.util.*; 
public class customer_run {

    public static class Customer {
        // class attributes 
        String name ;
        int age ; 
        String company;
        List<String> friendsList; 
        
        Customer(String name,int age,String company, List<String> friends_list){
            this.name = name; 
            this.age = age; 
            this.company = company;
            this.friendsList = friends_list;
        }
        
        void add_friend(String new_friend) {
            this.friendsList.add(new_friend); 
        }
        @Override
        public String  toString() {
            return "Customer: {name ="+this.name+ ", age = "+this.age+", company = "+this.company+"}";  
        }
    };

    public static void main(String[] args) {
    
        List<String> friends_list = new ArrayList<String>();
	    String[] array = {"Maria","Reethu","Sachu","Tony"};
	    Collections.addAll(friends_list, array);
        System.out.println(friends_list);

        Customer cust1 = new Customer("Thomas", 12, "CIMB", friends_list); 
        System.out.println(cust1);
    }
}
