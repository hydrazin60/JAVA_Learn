package D1.Homework;

import java.util.Scanner;

public class SwitchCaseQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println(month + " is January");
                break;
            case 2:
                System.out.println(month + " is February");
                break;
            case 3:
                System.out.println(month + " is March");
                break;
            case 4:
                System.out.println(month + " is April");
                break;
            case 5:
                System.out.println(month + " is May");
                break;
            case 6:
                System.out.println(month + " is June");
                break;
            case 7:
                System.out.println(month + " is July");
                break;
            case 8:
                System.out.println(month + " is August");
                break;
            case 9:
                System.out.println(month + " is September");
                break;
            case 10:
                System.out.println(null + " is October");
                break;
            case 11:
                System.out.println(month + " is November");
                break;
            case 12:
                System.out.println(month + " is December");
                break;
            default:
                System.out.println("Invalid month number only 1 to 12 months are  available");

        }

    }

}
