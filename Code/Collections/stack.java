import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("selena");
        s.push("Yugesh");
        s.push("lovers");
        System.out.println(s);
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        String peek = s.peek();
        System.out.println("peek"+peek);
        s.pop();
        System.out.println(s);
        int position = s.search("Yugesh");
        System.out.println(position);

    }
}
