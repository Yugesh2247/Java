
public class Const {
    String s = "";
    int a;

    Const() {
        this("sai", 22);
        String name = "Selena";
        int age = 28;
        String spouse = "yugesh";
        System.out.println("name:" + name + "Age:" + age + "Spouse:" + spouse);
    }

    Const(String name1, int age) {
        this.s = name1;
        this.a = age;
        System.out.println(name1 + "" + age);
    }

    Const(int a) {
        this();
        this.a = a;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Const c = new Const();
        Const c1 = new Const("Yugesh", 22);
        Const c3 = new Const(12);
    }

}
