class Arrays 
{
	public static void main(String[] args) 
	{

		int arr[]={1,2,3,4,5};
		
		System.out.println(arr[2]);//3
		arr[0]=0;
		
		System.out.println(arr.length);//5
		for(int i=0;i<5;i++)
		{
				System.out.println(arr[i]);//0,1,2,3,4,5
		}
		System.out.println("Hello World!");

		int arr2[][] ={ {1,2,3,4},{5,6,7,8}};
		
		System.out.println(arr2[1][0]);//5
		for( int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				
		System.out.println(arr2[i][j]);
		    }
		}
	}
}
