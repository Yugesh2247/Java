import java.util.*;
class Fib

{
public static void main(String[] arry)
{
int a=0;
int b=1;
int c=0;
System.out.println("enter a number to find fabinocci");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.print(c);
c=a+b;
a=b;
b=c;
}
}
}
