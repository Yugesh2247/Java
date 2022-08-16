public class rev {
    public static void main(String[] args) {
        String s = "selena";
        String s2 = "";
        char ch;
        int n = s.length() - 1;
        for (int i = n; i >= 0; i--) {
            ch = s.charAt(i);
            s2 = s2 + ch;
        }
        System.out.println(s2);
    }

}
