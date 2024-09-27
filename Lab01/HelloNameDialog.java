import javax.swing.JOptionPane;
public class HelloNameDialog{
	public static void main(String[] args){
		String result;
		result = JOptionPane.showInputDialog("Nguyen Phuc Anh - 20225784 Please enter your name:");
		JOptionPane.showMessageDialog(null, "Nguyen Phuc Anh - 20225784 Hi "+result+"!");
		System.exit(0);
	}
}