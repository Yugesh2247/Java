abstract class Animal
{
	public abstract void hello();
		public void sleep()
	{
		System.out.println("sleeping");
	}
}
class Pig extends Animal
{
	public void hello()
	{
		System.out.println("wow");
	}

}
class Helper
{
	public static void main(String[] args) 
	{
          Pig mypig=new Pig();
		  mypig.hello();
		  mypig.sleep();
	}
}
