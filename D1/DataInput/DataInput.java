package D1.DataInput;

import java.util.*;
// Conditional Statements ‘if-else’
// The if block is used to specify the code to be executed
// if the condition specified  in if is true, the else block is executed otherwise.

public class DataInput {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // nextLine used to input string type data

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // nextInt used to input int type data

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        // nextDouble used to input double type data

        System.out.print("Enter your GPA: ");
        float GPA = sc.nextFloat();
        // nextFloat used to input float type data

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("GPA: " + GPA);
    }
}
