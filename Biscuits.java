class Biscuits
{
	public static void main(String a[])
	{
		String biscuits[]={"Dark Fantasy","Oreo","Parle -G","Happy Happy","Good Day"};
		int amount[]={50,30,10,5,20};
		System.out.println("The size of the array is : "+biscuits.length);
		
		eating(biscuits,amount);
		
	}
	public static void eating(String[] biscuits,int[] amount)
	{
		for(int i=0;i<biscuits.length;i++)
			System.out.println(biscuits[i]+" amount is "+amount[i]);
	}
}