package D4;
// string are immutable
public class string2 {
    public static void main(String[] args) {
        String s1 = "jibao";
        String name = "jiban";
        // concatenation of two strings
        System.out.println(s1 + " " + name);
        //  length of a string
        System.out.println(name.length());
        // compare two strings
        System.out.println(s1.compareTo(name));
        // convert string to uppercase
        System.out.println(name.toUpperCase());
        // convert string to lowercase
        System.out.println(name.toLowerCase());
    }
}
