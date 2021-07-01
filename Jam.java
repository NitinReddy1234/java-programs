class Jam
{
	public static void main(String a[])
	{
		String jam[]={"Fruits","PineApple","Kissan","Banana"};
		System.out.println(jam[0]+" "+jam[1]+" "+jam[2]+" "+jam[3]);
		int amount[]={100,150,200,250};
		System.out.println("The size of the array is : "+jam.length);
		
				String[] value=eating(jam,amount);
		for(String o:value)
		{
			System.out.println(o);
		}
		
	}
	public static String[] eating(String jam[],int amount[])
	{
	String totaljam[]= new String[jam.length];
		for(int i=0;i<jam.length;i++)
		{
		jam[i]=jam[i] +" amount is "+ amount[i];
		totaljam[i]=jam[i];
		}
		return totaljam; 
	}
}