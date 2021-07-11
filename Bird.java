class Bird
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
	

	public void flying()
	{
		System.out.println("Birds are meant to fly freely into the sky ");
	}
	public void eagle()
	{
		System.out.println("Eagle is the strongest bird");
	}
	
}