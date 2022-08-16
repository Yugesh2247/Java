import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "selena";
        String s2 = "elesan";
        char[] s3 = s1.toLowerCase().toCharArray();
        char[] s4 = s2.toLowerCase().toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        System.out.println(s3 + "" + s4);
        if (s3.equals(s4)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }

    }

}
