import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c values to find the biggest:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Biggest number is a:" + a);
        } else if (b > c) {
            System.out.println("Biggest number is b:" + b);
        } else {
            System.out.println("Biggest number is c:" + c);
        }

    }
}
