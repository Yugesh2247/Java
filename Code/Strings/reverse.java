import java.util.Scanner;

public class reverse {
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
        System.out.println("Reverse:" + s1);
    }
}
