class RamanUtil
{
	public static void main(String a[])
	{
		System.out.println("Entering into the main method");
		Scientist scientist = new Scientist();
		scientist.setDetails("C V Raman");
		scientist.getDetails();
		scientist.inventing();
		scientist.discovery();
		
		Raman raman=new Raman();
		raman.fullName();
		raman.inventing();
		
		System.out.println("****************************************************************");
	
		Scientist cV = new Raman();
		System.out.println("Entering into the Polymorphism");
		cV.inventing();
	
	}
}