import java.util.*;

public class list {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("selena");
        l.add("Yugesh");
        l.add(123);
        l.add(0, "lovers");
        l.set(3, "shilpa");
        System.out.println((l));
        l.removeLast();
        System.out.println(l);
        l.addFirst("Couples");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
