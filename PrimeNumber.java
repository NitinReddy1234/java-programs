class PrimeNumber
{
	public static void main(String a[])
	{
		primeNumber(13);
	}
	public static void primeNumber(int x)
	{
		int temp=0;
		if(x==0 || x==1)
		{
			System.out.println("The number is not prime");
		}
		else
			System.out.println("The number is not 0 or 1");
		
		for(int i=2;i<=x-1;i++)
		{
			if(x%i==0)
			{
				temp+=1;
			}
		}
		if(temp==1)
		{
			System.out.println("The number is not prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
}