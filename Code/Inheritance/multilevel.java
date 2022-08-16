class A {
    public void m1() {
        System.out.println("inside class a");
    }
}

class b extends A {
    public void m2() {
        System.out.println("Inside class b");
    }
}

public class multilevel extends b {
    public static void main(String[] args) {
        b n = new b();
        n.m1();
        n.m2();
    }

}
