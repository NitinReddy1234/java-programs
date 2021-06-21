class MatrimonyPortal
{
	static char gender;
	static char male='M';
	static char female='F';
	static int age=22;
	
	public static void main(String a[])
	{
		System.out.println("Enter gender");
		System.out.println("The entered age is : "+age);
		malePortal();
		femalePortal();
	}
	public static void malePortal()
	{
		if(gender==male)
		{
			System.out.println("The gender is Male");
			if(age>=21)
			{
				System.out.println("You are eligible for Marriage :)");
			}
			else
				System.out.println("You are not eligible for Marriage :(");
		}
	}
	public static void femalePortal()
	{
if(gender==female)
		{
			System.out.println("The gender is Female");
			if(age>=18)
			{
				System.out.println("You are eligible for Marriage :)");
			}
			else
				System.out.println("You are not eligible for Marriage :(");
		}
	}
}