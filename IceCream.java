class IceCream
{
	public static void main(String a[])
	{
		String iceCream[]={"CupIce","Cone","ChocoBar","Kulfi"};
		System.out.println(iceCream[0]+" "+iceCream[1]+" "+iceCream[2]+" "+iceCream[3]);
		int amount[]={20,30,40,50};
		System.out.println("The size of the array is : "+iceCream.length);
		
				String[] value=eating(iceCream,amount);
		for(String o:value)
		{
			System.out.println(o);
		}
		
	}
	public static String[] eating(String iceCream[],int amount[])
	{
	String totaliceCream[]= new String[iceCream.length];
		for(int i=0;i<iceCream.length;i++)
		{
		iceCream[i]=iceCream[i] +" amount is "+ amount[i];
		totaliceCream[i]=iceCream[i];
		}
		return totaliceCream; 
	}
}