class Beach
{
	String name;
	String location;
	
	
	public Beach()
	{
		this("Baga","Goa");
		System.out.println("Entering into Default constructor");
		
	}
	public Beach(String name,String location)
	{
		System.out.println("Entering into the Parameterized Constructor");
		this.name=name;
		this.location=location;
		System.out.println(this.name+" " +this.location);
		System.out.println("Coming out of Parameterized Constructor");
	}
	
	public static void enjoy()
	{
		System.out.println("Baga Beach is the famus beach in Goa");
	}
}