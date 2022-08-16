import java.util.*;
import java.util.Collection;

public class set {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Selena");
        s.add("Helper");
        s.add("Yugesh");
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
