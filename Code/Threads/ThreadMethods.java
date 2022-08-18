class Th extends Thread {
    public void run() {
        Thread t1 = new Thread();
        for (int i = 0; i <= 5; i++) {
            try {
                t1.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println(i);
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Th t = new Th();

        System.out.println(t.getId());
        System.out.println(t.getName());
        t.setName("Yugesh");
        System.out.println("After changing the Name:" + t.getId());
        System.out.println(t.getPriority());
        t.setPriority(9);
        System.out.println("After changing the priority:" + t.getPriority());
        Th t2 = new Th();
        t.start();
        try {
            t.join();
        } catch (Exception e) {
        }
        t2.start();

    }
}
