package CLZ.String;
import java.util.Scanner;

public class Stringgs {




    public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
    System.out.println(args[i]);
    }
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name next : ");
    String name1 = sc.next();
    System.out.println(name1);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println(name);
    }
}
