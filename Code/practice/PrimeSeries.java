class PrimeSeries
{
    public static void main(String[] args)
    {
        int low=1;
        int high=100;
        int count=0;
        String prime=" ";
        for(int i=low;i<=high;i++)
        {
            for (int j=i;i>=1;j--)
            {
                if(i%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                prime=prime+i+' ';
            }
        }
        System.out.println(prime);

    }

}