import java.util.Scanner;

public class FunAddSub { 
    void mul(int c,int d)
    {
        int a=c*d;
        System.out.println("Multiplication of "+c+"and"+d+"is:"+a);
        div(c,d);

    }
    void div(int a, int e)
    {
        int c=a/e;
        System.out.println("Division of"+a+" and "+e+"is:"+c);
    }

    public void sub(int a,int b)
    {
        int c=a-b;
        System.out.println("Substraction of "+a+"and"+b+"is:"+c);
        mul(a,b);
    }
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("addition of "+a+"and"+b+"="+c);
        sub(a,b);
    }
    public static void main(String[] args) {
        System.out.println("Enter values :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        FunAddSub ad=new FunAddSub();
        ad.add(a,b);
    }
    
}
