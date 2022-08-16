class Hira implements parent,child
{
	public void show()
	{
		parent.super.show();
		child.super.show();
	}
	public static void main(String[] ass)
	{

        Hira d=new Hira();
		
		d.show();
		System.out.println("Hello World!");
	}
}

interface parent
{
	default void show()
	{
		System.out.println(1);
	}
}
interface child
{
	default void show()
	{
		System.out.println(2);
	}
}