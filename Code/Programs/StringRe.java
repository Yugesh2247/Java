class StringRe 
{
	public static void main(String[] args) 
	{
		String st="adda addu";
		String s="";
		int num=0;
		int n=st.length()-1;
		for(int i=n;i>=0;i--)
		{
	      s+=String.valueOf(st.charAt(i));
		}
		System.out.println(s);
		//System.out.println("Hello World!");
		if(s.equalsIgnoreCase(st)){
			System.out.println("polindrome"+ ++num);
			
		}
		else
		{
			System.out.println("not a polindrome"+num);
			
		}
	}
}
