import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Nguyen Phuc Anh - 20225784 : What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("Nguyen Phuc Anh - 20225784 : How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("nguyen Phuc Anh - 20225784 : How tall are you (m)?");
        double dHeight = keyboard.nextDouble();
        System.out.println("Nguyen Phuc Anh - 20225784 : Mrs/Mr. " + strName + ", " + iAge + " years old. " +
                            "Your height is " + dHeight + ".");
        keyboard.close();
    }
}
