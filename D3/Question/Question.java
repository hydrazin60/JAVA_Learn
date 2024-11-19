package Question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = sn.nextInt();
        int Marks[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + ": ");
            Marks[i] = sn.nextInt();
        }

        System.out.println("WHich student you want to search: ");
        int search = sn.nextInt();

        if (search > 0 && search <= arraySize) {
            System.out.println("Marks of student " + search + ": " + Marks[search - 1]);
        } else {
            System.out.println("Invalid Student Number");
        }
    }
}
