package D1.dataType;

import java.util.Date;
import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        Integer age = sc.nextInt();
        System.out.println("Enter your weight: ");
        Float weight = sc.nextFloat();
        System.out.println("Enter your height: ");
        Double height = sc.nextDouble();
        System.out.println("Enter your isAlive: ");
        Boolean isAlive = sc.nextBoolean();
        System.out.println("Your name is " + name);
        System.out.println("  Your age is " + age);
        System.out.println("  Your weight is " + weight);
        System.out.println("  Your height is " + height);
        System.out.println("  Your isAlive is " + isAlive);

    }
}
