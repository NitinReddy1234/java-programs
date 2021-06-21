class EvenOdd
{
	public static void main(String a[])
	{
		evenOrOdd(8);
	}
	public static void evenOrOdd(int x)
	{
		System.out.println("The given number is : "+x);
		if(x%2==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is Odd");
		}
	}
}