import java.util.concurrent.ExecutionException;

public class Exe3 {
    public static void main(String[] args) {
        try {
            int a = 12;
            int b = 29;
            int c = a + b;
            System.out.println(c);
            try {
                int d = 10 / 0;
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally");
        }
    }

}
