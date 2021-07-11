class Plastic
{
	String name;
	String materialUsed;
	
	public void setDetails(String name)
	{
		this.name=name;
	}
	
	public String getDetails()
	{
		return name;
	}
	

	public void material()
	{
		System.out.println("The chair is made up of plastic");
	}
	public void recycling()
	{
		System.out.println("Plastics cannot be Recycled");
	}
	
}