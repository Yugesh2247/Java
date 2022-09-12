import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check that palindrome or not:");
        String s = sc.nextLine();
        char ch;
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            s1 += ch;
        }
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not an polindrome");
        }
    }

}
