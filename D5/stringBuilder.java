public class stringBuilder {
    public static void main(String[] args) {
        // normal string
        String s1 = "Hello World!";
        StringBuilder sb = new StringBuilder("Hello World!");
        // access character at particular index
        System.out.println(sb.charAt(2));
        // set (replace) character at index
        sb.setCharAt(0, 'J');
        System.out.println(sb);
        // add (insert) character at particular index
        sb.insert(0, "Java ");
        System.out.println(sb);
        // delete (remove) character at particular index
        sb.delete(5, 6);
        System.out.println(sb);
        // print length of this string builder
        System.out.println(sb.length());

    }
}
