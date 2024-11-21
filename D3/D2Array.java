import java.util.Scanner;

public class D2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  rows of the array: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of the array: ");
        int columns = sc.nextInt();

        int NewArray[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the elements of row " + (i + 1) + " and column " + (j + 1) + ": ");
                NewArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(NewArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
