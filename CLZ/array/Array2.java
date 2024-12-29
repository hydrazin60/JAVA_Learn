package CLZ.array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "jiban";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = sc.nextInt();
        System.out.println("------------------------------------");
        System.out.println(" ");

        int array1[] = new int[sizeOfArray];
        String array2[] = new String[sizeOfArray];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("------------------------------------");
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");

            array2[i] = sc.nextLine();
        }
        System.out.println("------------------------------------");
        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Marks of student " + array2[i] + ": " + array1[i]);
        }
    }

}
