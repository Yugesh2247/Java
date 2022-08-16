interface Animal {
    public void dog();
    public void cat();
}

public class inter implements Animal {
    public void dog() {
        System.out.println("Bow-Bow");
    }

    public void cat() {
        System.out.println("Meow-Meow");
    }

    public static void main(String[] args) {
        inter a = new inter();
        a.dog();
        a.cat();
    }

}
