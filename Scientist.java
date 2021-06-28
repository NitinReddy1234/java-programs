class Scientist
{
	String name;
	String company;
	String department;
	
	public Scientist()
	{
		this("A P J Abdul Kalam","Indian Space Research Organisation(ISRO)","AeroSpace");
		System.out.println("Entering into Default constructor");
		
	}
	public Scientist(String name,String company,String department)
	{
		System.out.println("Entering into the Parameterized Constructor");
		this.name=name;
		this.company=company;
		this.department=department;
		System.out.println(this.name+" " +this.company+" " +this.department);
		System.out.println("Coming out of Parameterized Constructor");
	}
	
	public static void invention()
	{
		System.out.println("APJ was known as Missile Man of India");
	}
}