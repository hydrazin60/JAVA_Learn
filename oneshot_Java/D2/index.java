package oneshot_Java.D2;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 3));
        System.out.println(Math.min(2, 1));
        System.out.println((int) (Math.random() * 100));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        System.out.print("Enter your +2 GPA : ");
        float marks = sc.nextFloat();
        System.out.println(" ");
        System.out.println("Your name is : " + name);
        System.out.println("your age is : " + age);
        System.out.println("Your +2 GPA is : " + marks);
        if (age > 18) {
            System.out.println("welcome " + name + " You Can voat your age is  grater then 18");
        } else {
            System.out.println("Sorry  " + name + " You are a child you can't voat");
        }

        functionInJava();
        writeNameFunction("Jiban pandey");
        sumprint(10,  23);

    }

    public static void functionInJava() {
        System.out.println("Hello world");
    };

    public static void writeNameFunction(String name) {
        System.out.println(name);
    };

    public static void sumprint(int a , int b){
    System.out.println(a+b);
    }
}
