import java.util.Scanner;

public class aplhaornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Its an alphabet");
        } else {
            System.out.println("Its not an alphabet");
        }
    }
}
