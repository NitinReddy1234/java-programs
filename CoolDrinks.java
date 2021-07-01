class CoolDrinks
{
	public static void main(String a[])
	{
		String drinks[]={"Badam","Maaza","CocaCola","Pepsi"};
		System.out.println(drinks[0]+" "+drinks[1]+" "+drinks[2]+" "+drinks[3]);
		int amount[]={20,30,40,50};
		System.out.println("The size of the array is : "+drinks.length);
		
		coolDrinks(drinks,amount);
		
	}
	public static void coolDrinks(String[] drinks,int []amount)
	{
		for(int i=0;i<drinks.length;i++)
			System.out.println(drinks[i]+" amount is "+amount[i]);
	}
}