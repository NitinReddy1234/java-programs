class Soap
{
	public static void main(String a[])
	{
		String soaps[]={"Rexona","Santoor","Dove","Cinthol"};
		System.out.println(soaps[0]+" "+soaps[1]+" "+soaps[2]+" "+soaps[3]);
		int amount[]={20,30,40,50};
		System.out.println("The size of the array is : "+soaps.length);
		
		bathing(soaps,amount);
		
	}
	public static void bathing(String[] soaps,int []amount)
	{
		for(int i=0;i<soaps.length;i++)
			System.out.println(soaps[i]+" amount is "+amount[i]);
	}
}