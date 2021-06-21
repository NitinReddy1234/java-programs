class MarriagePortal
{
	public static void main(String a[])
	{
		String gender="Male";
		int age=22;
		
		if(gender=="Male")
		{
			System.out.println("The entered Gender is : "+gender);
			if(age>=21)
			{
				System.out.println("The entered Age is : "+age);
				System.out.println("You are Eligible to get Married  :)");
			}
			else
				System.out.println("You are Not Eligible to get Married  :(");
		}
		else if(gender=="Female")
		{
			System.out.println("The entered Gender is : "+gender);
			if(age>=18)
			{
				System.out.println("The entered Age is : "+age);
				System.out.println("You are Eligible to get Married  :)");
			}
			else
				System.out.println("You are Not Eligible to get Married  :(");
		}
			
	}
}