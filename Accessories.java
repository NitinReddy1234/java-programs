class Accessories
{
	public static void main(String a[])
	{
		String accessories[]={"Mobile","PC","Laptop","EarPhones"};
		System.out.println(accessories[0]+" "+accessories[1]+" "+accessories[2]+" "+accessories[3]);
		int amount[]={10000,30000,50000,2000};
		System.out.println("The size of the array is : "+accessories.length);
		
		using(accessories,amount);
		
	}
	public static void using(String[] accessories,int []amount)
	{
		for(int i=0;i<accessories.length;i++)
			System.out.println(accessories[i]+" amount is "+amount[i]);
	}
}