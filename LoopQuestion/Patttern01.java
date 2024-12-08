package LoopQuestion;

import java.util.Scanner;

public class Patttern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int colm = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < colm; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
// Output
// Enter the number of rows: 5
// Enter the number of columns: 5
// *****
// *****
// *****
// *****
// *****
