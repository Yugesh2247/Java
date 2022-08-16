class Hello
{
public static void main(String[] ayya)
{
int sum=0;
int n=999;
int num;

while(n>0)
{
num=n%10;
sum=sum+num;
n=n/10;
}
System.out.println(sum);
}
}