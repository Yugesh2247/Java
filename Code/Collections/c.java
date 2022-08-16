class Const1 {
    String name = "Visual code";

    Const1() {
        String name = "Selena";
        System.out.println(name);
    }
}

public class c extends Const1 {
    c() {
        super();
        System.out.println("Inside the shild class");
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        c s = new c();
    }
}
