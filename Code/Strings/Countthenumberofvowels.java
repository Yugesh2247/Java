import java.util.Scanner;

public class Countthenumberofvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count += 1;
            }
        }
        System.out.println("Total no.of vowels in given" + " " + str + " " + ":" + count);
    }
}
