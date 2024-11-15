
package D1.Homework;

import java.util.*;

public class CalculaterQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("the result of addition is: " + (a + b));
        System.out.println("the result of subtraction is: " + (a - b));
        System.out.println("the result of multiplication is: " + (a * b));
        System.out.println("the result of division is: " + (a / b));
        System.out.println("the modulo of a and b is: " + (a % b));

    }

}
