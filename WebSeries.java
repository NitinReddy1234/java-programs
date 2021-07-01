class WebSeries
{
	public static void createwebseries(String name,int year,String language)
	{
		System.out.println("Start of Method");
		System.out.println(name);
		System.out.println(year);
		System.out.println(language);
		System.out.println("End of Method");

	}
	public static void main(String a[])
	{
		System.out.println("Start of main Method");
		createwebseries("FamilyMan",2019,"Hindi");
		createwebseries("Mirzapur",2018,"Hindi");
		createwebseries("PaatalLok",2020,"Hindi");
		System.out.println("End of main Method");
	}
}