class Perfumes
{
	public static void main(String a[])
	{
		String perfumes[]={"Axe","Fogg","Brute","Wild Stone","Denver"};
		System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[4]);
		int amount=200;
		System.out.println("The size of the array is : "+perfumes.length);
		
				String[] value=fragrance(perfumes,amount);
		for(String o:value)
		{
			System.out.println(o);
		}
		
	}
	public static String[] fragrance(String odour[],int amount[])
	{
	String totalodour[]= new String[odour.length];
		for(int i=0;i<odour.length;i++)
		{
		odour[i]=odour[i] +" amount is "+ amount[i];
		totalodour[i]=odour[i];
		}
		return totalodour; 
	}
}