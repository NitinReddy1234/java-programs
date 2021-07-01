class Factorial
{
	public static void main(String []a)
	{
		double fact=factorial(5);
		System.out.println("The Factorial of the number is : "+fact);
	}
	public static int factorial(int a)
	{
		if(a==0)
			return 1;
		else 
			return (a*factorial(a-1));
	}
}