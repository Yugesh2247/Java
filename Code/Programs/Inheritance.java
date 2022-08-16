class parent{
	void hello1()
	{
		System.out.println("hello");
	}
}
class child extends parent
{
	void hello()
	{
		System.out.println("hello2");
}
}
class child1 extends parent
{
	public void help()

{
	System.out.println("helper");
}

}

class Inheritance 
{
	public static void main(String[] args) 
	{
		child1 d= new child1 ();
		child w=new child();
		w.hello();
		d.hello1();
		d.help();
	}
}


		
