class Groceries
{
	public static void main(String a[])
	{
		String groceries[]={"sugar","milk","flour","biscuits","bread"};
		System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]);
		int amount[]={38,23,50,10,40};
		System.out.println("The size of the array is : "+groceries.length);
		
				String[] value=dailyNeeds(groceries,amount);
		for(String o:value)
		{
			System.out.println(o);
		}
		
	}
	public static String[] dailyNeeds(String groceries[],int amount[])
	{
	String totalgroceries[]= new String[groceries.length];
		for(int i=0;i<groceries.length;i++)
		{
		groceries[i]=groceries[i] +" amount is "+ amount[i];
		totalgroceries[i]=groceries[i];
		}
		return totalgroceries; 
	}
}