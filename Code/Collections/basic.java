import java.util.Scanner;

public class basic {
    static int a = 12;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(basic.a);
        System.out.print("Name:");
        String name = s.next();
        System.out.print("Age:");
        int age = s.nextInt();
        System.out.print("Gender:");
        String Gender = s.next();
        System.out.println("YourName:" + name + "\n" + "YourAge:" + age + "\n" + "YourGender:" + Gender);

    }
}