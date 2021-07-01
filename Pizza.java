class Pizza
{
	public static void main(String a[])
	
	{
		eating("Regular,Medium,Large");
		eating(4,6,8);
	}
	public static void eating(String a)
	{
		System.out.println("Pizza is available in 3 different sizes i.e., :  "+a);
	}
	public static void eating(int a,int b,int c)
	{
		System.out.println("Number of pieces in Pizza are :  "+a+" "+b+" "+" "+c);
	}
	
}