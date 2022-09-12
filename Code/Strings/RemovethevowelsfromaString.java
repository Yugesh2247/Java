import java.util.Scanner;

public class RemovethevowelsfromaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        str = str.toLowerCase();
        String s = "";
        s = str.replaceAll("[aeiou]", "");
        System.out.println(s);
    }
}
