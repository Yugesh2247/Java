class Paa
{
public static void main(String[] arra)
{
int p=1;
int n=5;
char ch='a';
 for(int i=0;i<n;i++)
  {
    for(int k=n-1;k>=i;k--)
      {
        System.out.print(" ");
      
          
      }
    for(int j=0;j<i;j++)
      {
        System.out.print(p++);
           if(p==10)
          {
            p=1;
          }
      }
      for(int j=0;j<i;j++)
     {
        System.out.print(ch++ +"");
       }
       
   System.out.println();

       
   }
}
}