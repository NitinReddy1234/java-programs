class Novel
{
	String name;
	String writer;
	String originalLanguage;
	int datePremiered;
	String subject;
	
	public Novel()
	{
		this("Romeo and Juliet"," William Shakespeare","English",1597,"LOVE");
		System.out.println("Entering into Default constructor");
		
	}
	public Novel(String name,String writer,String originalLanguage,int datePremiered,String subject)
	{
		System.out.println("Entering into the Parameterized Constructor");
		this.name=name;
		this.writer=writer;
		this.originalLanguage=originalLanguage;
		this.datePremiered=datePremiered;
		this.subject=subject;
		System.out.println(this.name+" " +this.writer+" " +this.originalLanguage+" "+this.datePremiered+" "+this.subject);
		System.out.println("Coming out of Parameterized Constructor");
	}
	
	public static void plays()
	{
		System.out.println("Romeo and Juliet is a tragedy written by William Shakespeare.");
	}
}