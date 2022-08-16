class Strings 
{
	public static void main(String[] args) 
	{

		String arr="Hey help me";
		System.out.println(arr.toUpperCase());//HEY HELP ME
		System.out.println(arr.toLowerCase());//hey help me
		System.out.println(arr.length());//11
		System.out.println(arr.indexOf(7));//-1
		System.out.println(arr.replace('m','M'));//hey help Me
		System.out.println("Hello World!");//Hello World!
		char my=arr.charAt(4);
		System.out.println(my);//h
		System.out.println(arr.contains("help"));//true
		System.out.println(arr+"!");//Hey Help me!
		System.out.println(arr.substring(4,8));//help
		String hey="Hey help me";
		System.out.println(hey.isEmpty());//fasle
		System.out.println(hey.trim());
	}
}
