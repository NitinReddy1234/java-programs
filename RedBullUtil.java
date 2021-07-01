import java.util.Scanner;
class RedBullUtil
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price : ");
		int price=sc.nextInt();
		System.out.println("Enter the Id : ");
		String id=sc.next();
		sc.close();
		
		RedBull redBull=new RedBull();
		redBull.price=price;
		redBull.id=id;
		System.out.println("The  price of RedBull is : "+redBull.price);
		System.out.println("The  id of RedBull is : "+redBull.id);
		
		redBull.drinking();
		
	}
}