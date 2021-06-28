class Jewellery
{
	String material;
	String item;
	int grams;
	
	public Jewellery()
	{
		this("GOLD","Braclet",52);
		System.out.println("Entering into Default constructor");
		
	}
	public Jewellery(String material,String item,int grams)
	{
		System.out.println("Entering into the Parameterized Constructor");
		this.material=material;
		this.item=item;
		this.grams=grams;
		System.out.println(this.material+" " +this.item+" " +this.grams);
		System.out.println("Coming out of Parameterized Constructor");
	}
	
	public static void ornaments()
	{
		System.out.println("The Golden ornaments are used to get the Loan from the bank");
	}
}