class Library
{
	String name;
	String ownerName;
	int noOfBooks;
	String location;
	
	public static void main(String a[])
	{
		System.out.println("In main method");
		
		Library library= new Library();
		library.name="Central Library";
		library.ownerName="Government";
		library.noOfBooks=3000;
		library.location="In Cities";
		System.out.println(library.name+" is owned by "+library.ownerName+" contains  "+library.noOfBooks+" books and are located in  "+library.location);
		
		Library lib= new Library();
		
		lib.name="College Library";
		lib.ownerName="College Management";
		lib.noOfBooks=2000;
		lib.location="Inside College Campus";
		System.out.println(lib.name+" is owned by "+lib.ownerName+"  contains  "+lib.noOfBooks+" books and are located in  "+lib.location);
		
		Library books= new Library();
		
		books.name="District Libraries";
		books.ownerName="State Government";
		books.noOfBooks=2500;
		books.location="In Respective District";
		System.out.println(books.name+" is owned by  "+books.ownerName+" contains   "+books.noOfBooks+"  books and are located in "+books.location);
		
		System.out.println("Outside main method");
	}
}