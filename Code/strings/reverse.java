public class reverse {
    public static void main(String[] args) {
        String str = "selena";
        String s = " ";
        char ch;
        int n = str.length() - 1;
        for (int i = n; i >= 0; i--) {
            ch = str.charAt(i);
            s = s + ch;
        }
        System.out.println(s);
        if (str.equalsIgnoreCase(s)) {
            System.out.println("palindrome");
        } 
        else {
            System.out.println("not an polindrome");
        }
    }
}
