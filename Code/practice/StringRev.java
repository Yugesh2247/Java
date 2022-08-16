import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to find reverse");
        //String st="";
        String str=sc.next();
        StringBuffer buffer =new StringBuffer(str);
        buffer.reverse();
        String data=buffer.toString();
        if(str.equals(data)){
            System.out.println("palindrome");
        }
        else{
            System.out.print("not a polindrome");
        }
    }
}
