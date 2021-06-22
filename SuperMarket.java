class SuperMarket
{
	public static void main(String a[])
	{
		String vegetablesAndFruits[]={"Tomato","Potato","Apple","Mango"};
		int amount[]={20,30,40,50};
		System.out.println("The size of the array is : "+vegetablesAndFruits.length);
		
		String[] value=fetchVegetablesAndPrice(vegetablesAndFruits,amount);
		for(String s:value)
		{
			System.out.println(s);
		}
		
	}
	public static String[] fetchVegetablesAndPrice(String veggie[],int amount[])
	{
	String totalVeggie[]= new String[veggie.length];
		for(int i=0;i<veggie.length;i++)
		{
		veggie[i]=veggie[i] +" amount is "+ amount[i];
		totalVeggie[i]=veggie[i];
		}
		return totalVeggie; 
	}
	
}