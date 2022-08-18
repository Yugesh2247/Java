public class Thread3 {
    public void start() {

        System.out.println("inside child");
    }

    public void run() {
        System.out.println("int args ");
    }

    public static void main(String[] args) {
        Thread2 n = new Thread2();
        n.start();
        System.out.println("inside the main");
    }
}
