class Exceptions 
{
	public static void main(String[] args) 
	{
		int a=10;
		try{
			System.out.println(a/2);
		}
			catch(Exception e)
			{
				System.out.println("Exception handled");
			}
			finally{
				System.out.println("finally block");
			}
		

		
		System.out.println("Hello World!");
	}
}
