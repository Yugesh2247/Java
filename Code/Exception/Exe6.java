public class Exe6 {
    public static void main(String[] args) {
        int a = 20;
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("handled");
        }
    }

}
