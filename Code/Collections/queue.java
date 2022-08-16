import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("selena");
        q.add("Singer");
        q.add("yugesh");
        q.add("programmer");
        String s = q.peek();
        System.out.println("peek" + s);
        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        q.poll();
        System.out.println(q);

    }
}
