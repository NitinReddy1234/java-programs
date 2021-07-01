class ArithmeticOperation
{
	public static void sum(int a,int b)
	{
	System.out.println("Start of Add Method");
	int sum=a+b;
	System.out.println(sum);
	System.out.println("End of Add Method");
	}

	public static void difference(int a,int b)
	{
	System.out.println("Start of Subtract Method");
	int difference=a-b;
	System.out.println(difference);
	System.out.println("End of Subtract Method");
	}

	public static void product(int a,int b,int c)
	{
	System.out.println("Start of Multiplication Method");
	int product=a*b*c;
	System.out.println(product);
	System.out.println("End of Multiplication Method");
	}

	public static void quotient(int a,int b)
	{
	System.out.println("Start of Division Method");
	int quotient=a/b;
	System.out.println(quotient);
	System.out.println("End of Division Method");
	}

	public static void modulus(int a,int b)
	{
	
	System.out.println("Start of Modulus Method");
	int remainder=a%b;
	System.out.println(remainder);
	System.out.println("End of Modulus Method");
	}

	public static void main(String a[])
	{
	System.out.println("Start of Main Method");
	sum(7,3);
	difference(10,3);
	product(4,3,2);
	quotient(27,3);
	modulus(7,4);
	System.out.println("End of Main Method");
	}
}