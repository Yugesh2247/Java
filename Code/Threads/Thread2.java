public class Thread2 extends Thread {
    public void run() {

        System.out.println("inside child");
    }

    public void run(int i) {
        System.out.println("int args ");
    }

    public static void main(String[] args) {
        Thread2 n = new Thread2();
        n.start();
        System.out.println("inside the main");
    }

}
