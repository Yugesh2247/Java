import java.util.ArrayList;

class arraylist {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Selena");
        l.add("Yugesh");
        l.add("lovers");
        System.out.println("original list");
        System.out.println(l);
        System.out.println("Ater removing some elements");
        l.remove("lovers");
        for (String s : l) {
            System.out.println(s);
        }
        if (l.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("not empty");
        }
        if (l.contains("Selena")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
    }
}