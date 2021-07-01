class ProteinShakes
{
	public static void main(String a[])
	{
		String shakes[]={"MuscleBlaze","BigMuscles","OptimumNutrition","EnduraMass"};
		System.out.println(shakes[0]+" "+shakes[1]+" "+shakes[2]+" "+shakes[3]);
		int amount[]={2000,1500,3000,800};
		System.out.println("The size of the array is : "+shakes.length);
		
				String[] value=drinks(shakes,amount);
		for(String o:value)
		{
			System.out.println(o);
		}
		
	}
	public static String[] drinks(String energy[],int amount[])
	{
	String totalenergy[]= new String[energy.length];
		for(int i=0;i<energy.length;i++)
		{
		energy[i]=energy[i] +" amount is "+ amount[i];
		totalenergy[i]=energy[i];
		}
		return totalenergy; 
	}
}