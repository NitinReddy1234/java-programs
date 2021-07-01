class Chocolate
{
	public static void main(String a[])
	{
		String chocolates[]={"Dairy Milk","Kit Kat","Munch","Perk"};
		System.out.println(chocolates[0]+" "+chocolates[1]+" "+chocolates[2]+" "+chocolates[3]);
		int amount[]={10,20,30,40,50};
		System.out.println("The size of the array is : "+chocolates.length);
		
		indianChocolates(chocolates,amount);
		
	}
	public static void indianChocolates(String[] chocolates,int []amount)
	{
		for(int i=0;i<chocolates.length;i++)
			System.out.println(chocolates[i]+" amount is "+amount[i]);
	}
}