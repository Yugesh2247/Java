class HeartPattern 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
			for (int j=1;j<=6 ;j++ )
			{
				if(i==3&&j==3||i==2&&j==2||j==2&&i==5||j==1&&i==3||j==4&&i==6||i==5&&j==6||i==3&&j==6||j==5&&i==2)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
}
}