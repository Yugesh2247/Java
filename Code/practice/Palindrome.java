//import javafx.print.PrintColor;

class Palindrome{
    public static void main(String[] args) {
        System.out.println("hello");
        int a=143;
        int rem=0;
        int rev=0;
        int temp=a;
        while (a>0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if (temp==rev)
        {
            System.out.println("polindrome");
        }
        else{
            System.out.println("not an polindrome");
        }
    }
}