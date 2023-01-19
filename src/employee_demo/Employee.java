package employee_demo; 
public class Employee {
    String first_name; 
    String last_name;
    int age; 
    String country; 
    String mail;

    Employee(String first_name,String last_name,int age,String country){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age ; 
        this.country = country;
        
        mail = this.first_name.toLowerCase()+"."+this.last_name.toLowerCase()+"@mail.com";
        this.mail = mail; 
    }
    
    @Override
    // representation of object 
    public String toString() {
        return "Employee [first_name=" + first_name + ", last_name=" + last_name +", mail=" + mail + "]";
    }
    // method for updating the employee mail 
    public void update_mail(String new_mail){
        this.mail = new_mail; 
    }
}
