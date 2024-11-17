package D1.PatternsQuestion1;

import java.util.*;

// *****
// *****
// *****
// *****
public class PatternsQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of then pattern: ");
        int rowLines = sc.nextInt();
        System.out.println("Enter the number of columns of then pattern: ");
        int colLines = sc.nextInt();
        for (int i = 1; i <= rowLines; i++) {
            for (int j = 1; j <= colLines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
