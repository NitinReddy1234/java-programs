class Maximum
{
	public static void main(String a[])
	{
		maximumNumber(40,20,50);
	}
	public static void maximumNumber(int x,int y,int z)
	{
		if(x>y && x>z)
			System.out.println("The maximum number is : "+x);
		else if(y>x && y>z)
			System.out.println("The maximum number is : "+y);
		else
			System.out.println("The maximum number is : "+z);
	}
}