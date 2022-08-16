
public class Consoverload {
    Consoverload(double d) {
        this(10);
        System.out.println("Inside the double-args ");
    }

    Consoverload(int i) {
        this();
        System.out.println("inside the int-args");
    }

    Consoverload() {
        System.out.println("Inside the no-args");
    }

    public static void main(String[] args) {
        Consoverload c = new Consoverload(10.5);
    }

}
