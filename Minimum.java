class Minimum
{
	public static void main(String a[])
	{
		minimumNumber(10,20,30);
	}
	public static void minimumNumber(int x,int y,int z)
	{
		if(x<y && x<z)
			System.out.println("The minimum number is : "+x);
		else if(y<x && y<z)
			System.out.println("The minimum number is : "+y);
		else
			System.out.println("The minimum number is : "+z);
	}
}