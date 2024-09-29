import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, 
                    "Nguyen Phuc Anh - 20225784 Do you want to change to first class ticket?");
        JOptionPane.showMessageDialog(null, "Nguyen Phuc Anh - 20225784 You've chosen: "
                                        + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}