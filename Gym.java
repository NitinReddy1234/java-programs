class Gym
{
	String name;
	String location;
	String timings;
	
	public Gym()
	{
		this("Baga","Goa","6am-8pm");
		System.out.println("Entering into Default constructor");
		
	}
	public Gym(String name,String location,String timings)
	{
		System.out.println("Entering into the Parameterized Constructor");
		this.name=name;
		this.location=location;
		this.timings=timings;
		System.out.println(this.name+" " +this.location+" "+this.timings);
		System.out.println("Coming out of Parameterized Constructor");
	}
	
	public static void exercise()
	{
		System.out.println("Gym helps in being fit and fine");
	}
}