package D1.DataInput;

import java.util.*;

public class DataInput {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out. print(" Enter your name: ");
        String name = sc.nextLine();
        // nextLine used enput string type data
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // nextInt used enput int type data
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        // nextDouble used enput double type data
        System.out.print("Enter your GPA");
        float GPA = sc.nextFloat();
        // nextFloat used enput float type data
        
        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("GPA: " + GPA);
    }
}
