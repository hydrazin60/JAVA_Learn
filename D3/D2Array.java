import java.util.Scanner; // Import the Scanner class to take user input

public class D2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Ask the user for the number of rows
        System.out.println("Enter the rows of the array: ");
        int rows = sc.nextInt(); // Read the number of rows

        // Ask the user for the number of columns
        System.out.println("Enter the columns of the array: ");
        int columns = sc.nextInt(); // Read the number of columns

        // Declare and initialize a 2D array with the specified rows and columns
        int NewArray[][] = new int[rows][columns];

        // Loop to take input for each element of the 2D array
        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < columns; j++) { // Inner loop for columns
                System.out.println("Enter the elements of row " + (i + 1) + " and column " + (j + 1) + ": ");
                NewArray[i][j] = sc.nextInt(); // Read the element and store it in the array
            }
        }

        // Print the 2D array
        System.out.println("The array is: ");
        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < columns; j++) { // Inner loop for columns
                System.out.print(NewArray[i][j] + " "); // Print each element of the row
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
