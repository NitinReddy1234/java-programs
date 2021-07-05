class SamsungUtil
{
	public static void main(String a[])
	{
		
		SmartPhone galaxy=new Samsung();
		galaxy.price=100000;
		galaxy.id="1958454";
		System.out.println("The  price of Samsung is : "+galaxy.price);
		System.out.println("The  id of Samsung is : "+galaxy.id);
		
		Samsung.using();
		
	}
}