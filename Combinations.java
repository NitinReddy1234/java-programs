class Combinations
{
	public static void main(String a[])
	{
		combination(12,2);
	}
	public static void combination(int n,int r)
	{
		double nCr=(fact(n))/(fact(n-r)*fact(r)) ;
		double nPr=(fact(n))/(fact(n-r)) ;
		System.out.println("nCr value is : "+nCr);
		System.out.println("nPr value is : "+nPr);
	}
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));
	}
}