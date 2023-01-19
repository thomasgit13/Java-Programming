import java.util.ArrayList; 
import employee_demo.Employee; 

public class Main {
    public static void main(String[] args) {
        // arrays of parameters (for object creation) 
        String[] first_names = {"Thomas","Maria","Reethu","George"}; 
        String[] second_names = {"Martin","Thomas","Joseph","Mathew"}; 
        int[] ages = {28,27,27,26}; 
        String[] countries = {"India","Spain","India","Denmark"};
        
        //initializing arraylist for storing employee objects
        ArrayList<Employee> final_items = new ArrayList<Employee>(); 

        // creating cosumer objects 
        for(int i=0;i<first_names.length;i++){
            Employee emp = new Employee(first_names[i],second_names[i],ages[i],countries[i]);
            final_items.add(emp); 
        }; 

        // printing the final employee objects added 
        for(Employee c:final_items){
            System.out.println(c);
        };
    }
}