public class Cons1 {
    int q;
    int c;

    Cons1() {
        int a = 10;
        int b = 20;
        int result = a * b;
        System.out.println(result);
    }

    Cons1(int a, int b) {
        this.q = a;
        this.c = b;
        int result = a * b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Cons1 c = new Cons1();
        Cons1 c1 = new Cons1(20, 20);
    }
}