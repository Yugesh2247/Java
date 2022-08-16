class He
{
public static void main(String[] args)
{

// biggest among 5 
/*
int a=1;
int b=2;
int c=6;
int d=4;
int e=5;
if(a>b&&a>c&&a>d&&a>e)
{
System.out.println("a is Bigger"+a);
}
else if(b>c&&b>d&&b>e)
{
System.out.println("b is Bigger"+b);
}
else if(c>d&&c>e)
{
System.out.println("c is Bigger"+c);
}
else if(d>e)
{
System.out.println("d is Bigger"+d);
}
else
{
System.out.println("e is Bigger"+e);
}
*/

//WRT By using Ternary operator if age is greater than 25 display marriage eligible;

int  age=25;

String res=(age>=25)?"eligible":"not eligible";
System.out.println(res);



}
}