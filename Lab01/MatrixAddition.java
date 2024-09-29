import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nguyen Phuc Anh - 20225784 : Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Nguyen Phuc Anh - 20225784 : Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Nguyen Phuc Anh - 20225784 : Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nguyen Phuc Anh - 20225784 : Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nguyen Phuc Anh - 20225784 : Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nguyen Phuc Anh - 20225784 : Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Nguyen Phuc Anh - 20225784 : Result : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
