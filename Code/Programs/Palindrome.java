class Palindrome
{
	public static void main(String[] aaa)
	{
		int n=143;
		int temp=n;
		int rem=0;
		int res=0;
		while(n>0)
		{
		 rem=n%10;
		  res=(res*10)+rem;
		 n=n/10;
		
		}
		System.out.println(res);
		if(temp==res)
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a polindrome");
		}
	}
	}