import java.util.Scanner;
class DoloUtil
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price : ");
		int price=sc.nextInt();
		System.out.println("Enter the id : ");
		String id=sc.next();
		System.out.println("Enter the Manufacture Date : ");
		String mfgDate=sc.next();
		System.out.println("Enter the Expiry Date : ");
		String expDate=sc.next();
		sc.close();
		
		Dolo dolo=new Dolo();
		dolo.id=id;
		dolo.price=price;
		dolo.mfgDate=mfgDate;
		dolo.expDate=expDate;
		
		dolo.curing();
		
		System.out.println("The price of the Medicine is : "+dolo.price);
		System.out.println("The id of the Medicine is : "+dolo.id);
		System.out.println("The Manufactured Date of the Medicine is : "+dolo.mfgDate);
		System.out.println("The Expiry Date of the Medicine is : "+dolo.expDate);
	}
}