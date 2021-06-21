class OddEven
{
	public static void main(String a[])
	{
		oddOrEven(13);
	}
	public static void oddOrEven(int a)
	{
		boolean oddEven=(a%2==0)?true:false;
		System.out.println(oddEven);
	}
}