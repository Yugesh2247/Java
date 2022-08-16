class StringReverse
{
	public static void main(String[] args) 
	{

		String st="selena";
                String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev+=String.valueOf(st.charAt(i));
	        }
System.out.println(rev);
}
}
