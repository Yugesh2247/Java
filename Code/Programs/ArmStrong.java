 class ArmStrong{
public static void main(String[] hawk){
int n=9;
int sum=0;
int temp=n;
int count=0;
while(temp>0){
temp/=10;
count++;
}
System.out.println("no of digits in "+n +"is"+count);
int num=n;
double pow;
while(num>0){
int mod=num%10;
pow=Math.pow(mod,count);
System.out.println("power of each number is "+pow);
sum+=pow;
System.out.println("sum of power of count of each number is "+sum);
num/=10;
}

System.out.println("sum is "+sum);

if (sum==n){
System.out.println(n+" is  a Armstrong number");
}
else
{
System.out.println(n+"is not a Armstrong number");
}
}
}