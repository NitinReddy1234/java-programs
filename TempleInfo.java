class TempleInfo
{
	public static void main(String a[])
	{
		Temple temple= new Temple();
		temple.name="Kedarnath Temple";
		temple.place="Kedarnath,UttaraKhand";
		temple.nameOfGod="Lord Shiva";
		System.out.println(temple.name+" "+temple.place+" "+temple.nameOfGod);
		
		Temple mosque= new Temple();
		mosque.name="Jami Masjid";
		mosque.place="VijayPura,Karnataka";
		mosque.nameOfGod="Allah";
		System.out.println(mosque.name+" "+mosque.place+" "+mosque.nameOfGod);
		
		Temple church= new Temple();
		church.name="St.Philomenas Church";
		church.place="Mysore,Karnataka";
		church.nameOfGod="Lord Jesus";
		System.out.println(church.name+" "+church.place+" "+church.nameOfGod);
		
		Temple.getInfo();
		Temple.whyTemples();
	}
}