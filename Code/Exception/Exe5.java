public class Exe5 {
    public static void main(String[] args) {
        try {
            int a = 12;
            int b = 29;
            int c = a + b;
            System.out.println(c);
            try {
                int d = 10 / 0;
                try {
                    int s = 10;
                    System.out.println(s);
                } catch (Exception e) {
                    System.out.println("handled");
                }
            } catch (Exception e) {
                System.out.println("Exception handled");
            }
        } catch (Exception e) {
            System.out.println("Hanled");
        }
    }
}
