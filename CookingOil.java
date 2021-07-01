class CookingOil
{
	public static void main(String a[])
	{
		String cookingOil[]={"SunFlower","Mustard","Olive","Almond"};
		System.out.println(cookingOil[0]+" "+cookingOil[1]+" "+cookingOil[2]+" "+cookingOil[3]);
		int amount[]={160,180,200,500};
		System.out.println("The size of the array is : "+cookingOil.length);
		
		oil(cookingOil,amount);
		
	}
	public static void oil(String[] cookingOil,int []amount)
	{
		for(int i=0;i<cookingOil.length;i++)
			System.out.println(cookingOil[i]+" amount is "+amount[i]);
	}
}