package D2.function;

import java.util.*;

public class basicsFunction {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = add(a, b);

        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

}
