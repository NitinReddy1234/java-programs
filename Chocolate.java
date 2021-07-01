class Chocolate
{
	public static void main(String a[])
	{
		eat(7);
		eat("parle");
		eat(1,2);
	}
	
	public static void eat(int noOfUnits)
	{
		System.out.println("Eating "+noOfUnits+" Chocolates per Day");
	}
	public static void eat(String name)
	{
		System.out.println("I Love Eating "+name+" Chocolate");
	}
	public static void eat(int cost,int units)
	{
		System.out.println("Cost of the Chocolates is: "+cost+" for "+units+" units ");
	}
}