class A1 {
    public void m1() {
        System.out.println("inside the parent class");
    }
}

public class methodoverri extends A1 {
    public void m1() {
        System.out.println("inside the child class");
    }

    public static void main(String[] args) {
        methodoverri m = new methodoverri();
        m.m1();

    }

}
