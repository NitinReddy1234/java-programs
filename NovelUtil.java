class NovelUtil
{
	public static void main(String a[])
	{
		Novel novel=new RomeoJuliet();
		novel.name="Hamlet";
		novel.author="Shakesphere";
		novel.gainingKnowledge();
		
		
		System.out.println(novel.name+novel.author);
	}
}