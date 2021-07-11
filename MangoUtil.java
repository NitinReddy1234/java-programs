class MangoUtil
{
	public static void main(String a[])
	{
		System.out.println("Entering into the main method");
		Fruits fruit = new Fruits();
		fruit.setDetails("Mango");
		fruit.getDetails();
		fruit.king();
		fruit.taste();
		
		Mango mango=new Mango();
		mango.getDetails();
		mango.king();
		
		System.out.println("****************************************************************");
	
		Fruits aam = new Mango();
		System.out.println("Entering into the Polymorphism");
		aam.king();
	
	}
}