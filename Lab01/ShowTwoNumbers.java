import javax.swing.JOptionPane;
public class showTwoNumbers {
	public static void main(String[] args){
		String strNum1, strNum2;
		String strNotification = "Nguyen Phuc Anh - 20225784 You've just entered: ";

		strNum1 = JOptionPane.showInputDialog(null,
				"Nguyen Phuc Anh - 20225784 - Please input the first number: ", "Nguyen Phuc Anh - 20225784 - Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and";

		strNum2 = JOptionPane.showInputDialog(null,
				"Nguyen Phuc Anh - 20225784 - Please input the second number: ", "Nguyen Phuc Anh - 20225784 - Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;

		JOptionPane.showMessageDialog(null, strNotification,
				"Nguyen Phuc Anh - 20225784 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}