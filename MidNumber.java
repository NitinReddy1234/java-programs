class MidNumber
{
	public static void main(String a[])
	{
		middleNumber(10,40,30);
	}
	public static void middleNumber(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			{
				if(y>z)
				{
					System.out.println("The middle number is : "+y);
				}
				else
				{
					System.out.println("The middle number is : "+z);
				}
			
			}
			System.out.println("The middle number is : "+x);
		}
		else if(y>z)
		{
			if(x>z)
			{
				System.out.println("The middle number is : "+x);
			}
			else
			{
				System.out.println("The middle number is : "+z);
			}
		}
		else
		{
			System.out.println("The middle number is : "+y);
		}
	}
}