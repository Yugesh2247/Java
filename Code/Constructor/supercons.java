class ma {
    String s = "selena";

    ma() {
        System.out.println("inside no-args");
    }
}

public class supercons extends ma {
    int a;

    supercons(int a) {
        super();
        this.a = a;
        System.out.println(super.s);
        System.out.println(a);
        System.out.println("inside parametarized");
    }

    public static void main(String[] args) {
        supercons s = new supercons(10);

    }
}
