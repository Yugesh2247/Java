import java.util.Scanner;

public class Removeallcharactersfromstringexceptalphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        s2 = s.replaceAll("[^a-z]", "");
        System.out.println(s2);
    }

}
