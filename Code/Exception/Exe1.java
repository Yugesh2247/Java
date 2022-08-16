public class Exe1 {
    public static void main(String[] args) {
        dostuff();
    }

    public static void dostuff() {
        domorestuff();
    }

    public static void domorestuff() {
        doi();
    }

    public static void doi() {
        System.out.println("hello");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("successfully completed!..");
        }

    }
}