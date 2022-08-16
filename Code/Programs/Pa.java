class Pa
{
public static void main(String[] attu)
{
int n=4;
int k=1;
char ch='a';
for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
   {
     if(i+j>=n-1)
     {
       System.out.print(k++ +" ");
     }                                                                                   /* output
                                                                                            1a
                                                                                           23bc
                                                                                          456def 
                                                                                         7891ghij */
      else
        System.out.print("  ");
      if(k==10)
           {
             k=1;
            }

   }
   for(int j=0;j<n;j++)
    {
      if(i>=j)
       {
         System.out.print(ch++ +" ");
       }
      else
          System.out.print("  ");
     }
 System.out.println();
}
}
}  


