class ChappalUtil
{
	public static void main(String a[])
	{
		Slippers slip=new Slippers();
		Shoes shoe=new Shoes();
		
		System.out.println(slip.brand+" "+slip.slipperType);
		System.out.println(shoe.brand+" "+shoe.shoeType);
		
		FootWear.uses();
		slip.easy();
		shoe.messy();
		
	}
}