import java.util.Scanner;
class MomosUtil
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price : ");
		int price=sc.nextInt();
		System.out.println("Enter the Id : ");
		String id=sc.next();
		sc.close();
		Momos momo=new Momos();
		momo.price=price;
		momo.id=id;
		System.out.println("The  price of Momos is : "+momo.price);
		System.out.println("The  id of Momos is : "+momo.id);
		
		momo.eating();
		
	}
}