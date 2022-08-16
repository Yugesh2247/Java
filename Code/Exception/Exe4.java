public class Exe4 {
    public static void main(String[] args) {
        try {
            int a = 12;
            int b = 29;
            int c = 1 / 0;
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
