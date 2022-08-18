class Mythread extends Thread {
    public void run() {
        System.out.println("child class");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class Thread1 {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        System.out.println("Main class");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
// but the flow of execution not equal always,some time it execute run ,then it
// execute start methods.