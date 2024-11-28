// Package declaration, which organizes the class into a package named "D4".
package D4;

// Importing the Scanner class from java.util package for taking user input.
import java.util.Scanner;

// Defining a public class named "string" (not recommended to name it "string" as it clashes with the built-in String class).
public class stringss {
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Declaring and initializing a string variable with the value "Hello World!".
        String s1 = "Hello World!";

        // Declaring and initializing an integer variable named age with the value 20.
        int age = 20;

        // Declaring and initializing another string variable with the full name "Jiban
        // pandey".
        String fullName = "Jiban pandey";

        // Printing the values of s1, age, and fullName to the console, separated by
        // spaces.
        System.out.println(s1 + " " + age + " " + fullName);

        // Creating a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter their name.
        System.out.print("Enter your name: ");

        // Reading the user's input as a line of text and storing it in the variable
        // "name".
        String name = sc.nextLine();
        // Printing the user's name to the console.
        System.out.println("your name is : " + name);
    }
}
