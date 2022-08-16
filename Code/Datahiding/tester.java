
public class tester {
    public static void remove(String str) {
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "hello   how are you";
        remove(str);
    }

}
