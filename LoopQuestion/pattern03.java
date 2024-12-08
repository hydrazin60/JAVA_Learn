package LoopQuestion;

public class pattern03 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// *****