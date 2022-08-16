public class methodoverlo {
    public void m1() {
        String name = "Selena";
        int n = 143;
        System.out.println(name + " " + n);
    }

    public void m1(int a) {
        String name = "Yugesh";
        int n = a;
        System.out.println(name + " " + n);
    }

    public static void main(String[] args) {
        methodoverlo m = new methodoverlo();
        m.m1();
        m.m1(143);
    }

}
