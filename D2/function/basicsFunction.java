package D2.function;

import java.util.Scanner;

public class basicsFunction {
    public static void multiple(int a) {

        if (a < 0) {
            System.out.println("Factorial of negative number doesn't exist");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + a + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        multiple(a);
        sc.close();
    }
}
