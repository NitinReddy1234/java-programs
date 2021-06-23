class SocialMedia
{
	String name;
	String ownerName;
	String color;
	boolean isInternetRequired=true;
	
	public static void main(String a[])
	{
		System.out.println("In main method");
		SocialMedia socialMedia= new SocialMedia();
		System.out.println("Reference variable for SocialMedia is created");
		socialMedia.name="Telegram";
		socialMedia.color="whiteAndBlue";
		socialMedia.ownerName="Pavel Durov";
		socialMedia.isInternetRequired=true;
		System.out.println(socialMedia.name+" "+socialMedia.color+" "+socialMedia.ownerName+" "+socialMedia.isInternetRequired);
		
		SocialMedia social= new SocialMedia();
		System.out.println("Reference variable for SocialMedia is created");
		social.name="Instagram";
		social.color="MaroonRed";
		social.ownerName="Kevin Systrom";
		social.isInternetRequired=true;
		System.out.println(social.name+" "+social.color+" "+social.ownerName+" "+social.isInternetRequired);
		
		SocialMedia sm= new SocialMedia();
		System.out.println("Reference variable for SocialMedia is created");
		sm.name="Instagram";
		sm.color="MaroonRed";
		sm.ownerName="Kevin Systrom";
		sm.isInternetRequired=true;
		System.out.println(sm.name+" "+sm.color+" "+sm.ownerName+" "+sm.isInternetRequired);
		
		System.out.println("Outside main method");
	}
}