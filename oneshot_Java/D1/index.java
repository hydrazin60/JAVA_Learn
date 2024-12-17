package oneshot_Java.D1;

import java.util.Arrays;

public class index {
    public static void main(String[] args) {
        //  primitive Data Type
        int phone = 1234545556;
        long phone2 = 3243466565576L;
        float py = 3.14F;
        char letter = 'a';
        boolean isAdult = false;
        byte age = 30;
        // None-Primitive Data Typoe
        String name = new String("jiban");
        // concatenate
        String String1 = "Jiban";
        String String2 = "Pandey";
        String yourName = String1 + " " + String2;
        System.out.println(yourName);
        // CharAt
        String Stringg1 = "Jiban pandey";
        System.out.println(Stringg1.charAt(3));
        // length
        System.out.println(Stringg1.length());
        // replace
        System.out.println(Stringg1.replace("J", "k")); // not update orginal string replace method create a new string
        System.out.println(Stringg1);
        // substring
        System.out.println(Stringg1.substring(0, 4)); // not update orginal stringsubstring method create a new string
        // ////////////// Array /////////////
        int[] marks = new int[5];
        marks[0] = 97;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 79;
        marks[4] = 60;
        System.out.println(marks[0]);
        // length
        System.out.println(marks.length); // length is not method this is a property of Array
        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);
        String studentName[] = { "jiban", "nisan", "Thapa kaji", "roshan" };
        System.out.println(studentName[2]);
        // 2-D Array
        int fullMarks[][] = { { 90, 23, 43, 45, 66 }, { 123, 24, 45, 56, 77 } };
        System.out.println(fullMarks[1][0]);
        // /////////////// const /////////////
        final float PY = 3.14F; // const value assign

    }
}
