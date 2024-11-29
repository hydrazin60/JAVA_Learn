public class Operators {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 0;

        // int c = 5;
        // int d = 0;

        // b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // ////////////// AND (&)
        // // Compares each bit of two numbers and sets the result bit to 1 if both bits
        // are 1, otherwise 0. [similar to AND operator but not same a&b != a&&b]
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011
        int resultt = a & b; // Binary: 0001 = 1
        System.out.println(resultt);
        // // OR (|)
        // // Compares each bit of two numbers and sets the result bit to 1 if either
        //////////////// bit is 1.
        int d = 5; // Binary: 0101
        int e = 3; // Binary: 0011
        int result = d | e; // Binary: 0111 = 7
        System.out.println(result);

        ///////////////// XOR (^)
        // //Compares each bit of two numbers and sets the result bit to 1 if bits are
        // different, otherwise 0.
        int j = 5; // Binary: 0101
        int p = 3; // Binary: 0011
        int results = j ^ p; // Binary: 0110 = 6
        System.out.println(results);

    }
}
