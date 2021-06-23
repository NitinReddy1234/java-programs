class Restaurants
{
	String name;
	String ownerName;
	int noOfStaffs;
	String location;
	
	public static void main(String a[])
	{
		System.out.println("In main method");
		
		Restaurants hotel= new Restaurants();
		hotel.name="The Prestige Hotel";
		hotel.ownerName="Sunil Shetty";
		hotel.noOfStaffs=100;
		hotel.location="Mangalore";
		System.out.println(hotel.name+" is owned by "+hotel.ownerName+" contains  "+hotel.noOfStaffs+" Staffs and is located in  "+hotel.location);
		
		Restaurants cuisine= new Restaurants();
		
		cuisine.name="Bastian";
		cuisine.ownerName="Shilpa Shetty";
		cuisine.noOfStaffs=100;
		cuisine.location="Bandra";
		System.out.println(cuisine.name+" is owned by "+cuisine.ownerName+"  contains  "+cuisine.noOfStaffs+" Staffs and is located in  "+cuisine.location);
		
		Restaurants barbeque= new Restaurants();
		
		barbeque.name="Dine Fine";
		barbeque.ownerName="Zaheer Khan";
		barbeque.noOfStaffs=100;
		barbeque.location="Pune";
		System.out.println(barbeque.name+" is owned by  "+barbeque.ownerName+" contains   "+barbeque.noOfStaffs+"  Staffs and is located in "+barbeque.location);
		
		System.out.println("Outside main method");
	}
}