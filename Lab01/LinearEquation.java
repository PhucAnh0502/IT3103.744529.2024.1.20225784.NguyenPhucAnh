import javax.swing.JOptionPane;
public class LinearEquation {
    public static void main(String[] args) {
        String strA, strB;
        strA = JOptionPane.showInputDialog(null,
                "Nguyen Phuc Anh - 20225784 - Please input a: ", "Nguyen Phuc Anh - 20225784 - Input a",
                JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,
                "Nguyen Phuc Anh - 20225784 - Please input b: ", "Nguyen Phuc Anh - 20225784 - Input b",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if(a == 0 && b!=0){
            JOptionPane.showMessageDialog(null,
                 "Nguyen Phuc Anh - 20225784 : Phuong trinh vo nghiem");
        } else if (a==0 && b==0){
            JOptionPane.showMessageDialog(null, 
                "Nguyen Phuc Anh - 20225784 : Phuong trinh vo so nghiem");
        } else {
            double ans = -b / a;
            JOptionPane.showMessageDialog(null, 
                "Nguyen Phuc Anh - 20225784 : Nghiem cua phuong trinh la : " + ans);
        }
    }
}
