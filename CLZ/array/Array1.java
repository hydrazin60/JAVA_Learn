package CLZ.array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = sc.nextInt();
        float sum = 0;
        int marks[] = new int[sizeOfArray];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("_____________________________________");
        for (int i = 0; i < marks.length; i++) {
            sum = marks[i] + sum;
        }
        ;
        System.out.println(" sum of all marks is : " + sum);

        // ------------------------------------------------------

        String Students[] = new String[5];
        for (int i = 0; i < Students.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            Students[i] = sc.nextLine();
        }
        System.out.println("__________________");
        for (int i = 0; i < Students.length; i++) {
            System.out.println(Students[i]);
        }

    }
}
