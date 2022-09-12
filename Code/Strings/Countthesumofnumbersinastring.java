import java.util.Scanner;

public class Countthesumofnumbersinastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        s = str.replaceAll("[^0-9]", "");
        System.out.println(s);
        int i = Integer.parseInt(s);
        int sum = 0;
        int rem = 0;
        while (i > 0) {
            rem = i % 10;
            sum = sum + rem;
            i = i / 10;
        }
        System.out.println("sum of the numbers in str:" + sum);
    }

}
