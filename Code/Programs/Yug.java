class  Yug
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		
		{
			/*for(int j=1;j<=5;j++)
			{
				if(j==3&&i>=3||i==3||j==1&&i<=3||j==5&&i<=3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}*/
			
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("");
			}
              for(int j=1;j<=5;j++)
			{
				if(i==3&&j==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("");
			}
			
			for (int j=1;j<=5;j++ )
			{
				if(i==j&&i<=3||j==3&&i>=3||j==6-i&&i<=3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
		
			for(int j=1;j<=5;j++)
			{
				if(j==1||i==5||j==5)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
			    }
			}

			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=5;j++)
			{
				if(j==1||i==1||i==5||i==3||j==5&&i>=3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(j==1||i==1||i==3||i==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||i==3||j==1&&i<=3||j==5&&i>=3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==5||i==3)
				{
				System.out.print("* ");
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
