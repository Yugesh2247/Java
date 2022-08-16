
public class thiscons {
    String name = "selena";

    thiscons(String name) {
        this(10);
        this.name = name;
        System.out.println(name);
    }

    thiscons(int i) {
        System.out.println("name");
    }

    public static void main(String[] args) {
        thiscons n = new thiscons("Yugesh");
    }

}
