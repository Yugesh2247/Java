public class Exe2 {
    static String name = "selena";
    static int a = 12;

    public static void main(String[] args) {
        System.out.println(a);
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
