class Cereals
{
	public static void main(String a[])
	{
		String cereals[]={"Black Gram","Green Gram","Split Grams","Moong Dal"};
		System.out.println(cereals[0]+" "+cereals[1]+" "+cereals[2]+" "+cereals[3]);
		int amount[]={100,200,300,400};
		System.out.println("The size of the array is : "+cereals.length);
		
		indianGrams(cereals,amount);
		
	}
	public static void indianGrams(String[] cereals,int []amount)
	{
		for(int i=0;i<cereals.length;i++)
			System.out.println(cereals[i]+" amount is "+amount[i]);
	}
}