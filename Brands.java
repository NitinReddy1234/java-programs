class Brands
{
	String name;
	String items;
	
	public static void main(String a[])
	{
		Brands brand= new Brands();
		brand.name="Apple";
		brand.items="Electronic Accessories and Gadgets";
		System.out.println(brand.name+" "+brand.items);
		
		Brands quality= new Brands();
		quality.name="Boat";
		quality.items="Speakers";
		System.out.println(quality.name+" "+quality.items);
	}
}