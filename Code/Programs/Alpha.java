class Alpha
{
public static void main(String[] arru)
{
 int n=5;
  for (int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==0&&j==n-1 || i==n-1&&j==n-1)
     {
       System.out.print("  ");
     }
     else
     {
     if(j==0||i==0||i==n/2||i==n-1)
     {
      System.out.print("*");