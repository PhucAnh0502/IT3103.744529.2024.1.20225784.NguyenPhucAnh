import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nguyen Phuc Anh - 20225784 : Enter the number of elements in the array: ");
        int size = sc.nextInt();

        double[] arr = new double[size];

        System.out.println("Nguyen Phuc Anh - 20225784 : Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        double average = sum / size;

        System.out.println("Nguyen Phuc Anh - 20225784 : Sorted array: " + Arrays.toString(arr));
        System.out.println("Nguyen Phuc Anh - 20225784 : Sum: " + sum);
        System.out.println("Nguyen Phuc Anh - 20225784 : Average: " + average);

        sc.close();
    }
}
