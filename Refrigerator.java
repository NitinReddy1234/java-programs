class Refrigerator
{
	public static void main(String a[])
	{
		cooling("Whirlpool");
		cooling(2);
	}
	public static void cooling(String brand)
	{
		System.out.println("The name of the Refrigerator is : "+brand);
	}
	public static void cooling(int door)
	{
		System.out.println("The number of doors in the Refrigerator is : "+door);
	}
}