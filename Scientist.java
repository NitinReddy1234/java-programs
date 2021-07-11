class Scientist
{
	String name;
	
	public void setDetails(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	
	
	public String getDetails()
	{
		return name;
	}
	

	public void inventing()
	{
		System.out.println("Scientist helps in the development of the country ");
	}
	public void discovery()
	{
		System.out.println("Scientist discover many useful things");
	}
	
}