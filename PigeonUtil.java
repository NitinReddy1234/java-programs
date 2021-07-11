class PigeonUtil
{
	public static void main(String a[])
	{
		System.out.println("Entering into the main method");
		Bird bird = new Bird();
		bird.setDetails("Pigeon");
		bird.getDetails();
		bird.flying();
		bird.eagle();
		
		Pigeon pigeon=new Pigeon();
		pigeon.beauty();
		pigeon.flying();
		
		System.out.println("****************************************************************");
	
		Bird cV = new Pigeon();
		System.out.println("Entering into the Polymorphism");
		cV.flying();
	
	}
}