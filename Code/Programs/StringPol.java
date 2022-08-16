class StringPol 
{
  public static boolean isPalindrome(String str)
		{
           int i=0;
		   int j=str.length()-1;
		      while(i<j)
			{
				  if(str.charAt(i)!=str.charAt(j))
					  return false;
				  i++;
				  j--;
			}
			return true;
		}
		public static void main(String[] args) 
	{
		String str="adda ";
		int num=0;
		if(isPalindrome(str))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		if(true)
		{
			System.out.println(++num);
		}
		
	}
	}

		
	

