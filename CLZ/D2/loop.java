import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
         System.out.println();
        }
        sum(4,7);
    }

    public static void sum(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }
}
