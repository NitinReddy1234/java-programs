class ChairUtil
{
	public static void main(String a[])
	{
		System.out.println("Entering into the main method");
		Plastic plastic = new Plastic();
		plastic.setDetails("Nilkamal");
		plastic.getDetails();
		plastic.material();
		plastic.recycling();
		
		Chair chair=new Chair();
		chair.getDetails();
		chair.material();
		
		System.out.println("****************************************************************");
	
		Plastic poly = new Plastic();
		poly.material();
	
	}
}