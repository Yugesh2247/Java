class MoverLoading 
{
	public static void main(String[] args) 
	{
		System.out.println(Add.add(10,10));
		System.out.println(Add.add(10,10,28));
	}
}

class Add
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
}
}