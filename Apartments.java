class Apartments
{
	String name;
	String ownerName;
	String location;
	int noOfStories;
	
	public Apartments()
	{
		this("The Dubai Marina","Sheffield Holdings Limited","United Arab Emirates",101);
		System.out.println("Entering into Default constructor");
		
	}
	public Apartments(String name,String ownerName,String location,int noOfStories)
	{
		System.out.println("Entering into the Parameterized Constructor");
		this.name=name;
		this.ownerName=ownerName;
		this.noOfStories=noOfStories;
		this.location=location;
		System.out.println(this.name+" " +this.ownerName+" " +this.noOfStories+" "+this.location);
		System.out.println("Coming out of Parameterized Constructor");
	}
	
	public static void living()
	{
		System.out.println("The Marina building is the 30th tallest building in the world");
	}
}