import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Marks of student " + (i + 1) + ": " + marks[i]);
        }
    }

}