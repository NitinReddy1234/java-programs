class TeleVision
{
	public static void main(String a[])
	{
		watching("The Kapil Sharma Show");
		watching("9:00 pm","Sony");
	}
	
	public static void watching(String tkss)
	{
		System.out.println("I Like to watch "+tkss+" in TV");
	}
	public static void watching(String time,String channel)
	{
		System.out.println("at "+time+" in"+channel+" channel ");
	}
}