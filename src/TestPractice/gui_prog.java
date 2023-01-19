import javax.swing.JOptionPane;

public class gui_prog {
	public static void main(String []args) {
		// note: input dialogue box returns a string 

		String name= JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		
		int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Hello your age is " +age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your height is "+ height);
	}
}

