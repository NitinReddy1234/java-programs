class PlayStore
{
	String name;
	String ownerName;
	String color;
	boolean isInternetRequired=true;
	double sizeInGb;
	
	public static void main(String a[])
	{
		System.out.println("In main method");
		PlayStore playStore= new PlayStore();
		System.out.println("Reference variable for playStore is created");
		playStore.name="Telegram";
		playStore.color="whiteAndBlue";
		playStore.ownerName="Pavel Durov";
		playStore.isInternetRequired=true;
		System.out.println(playStore.name+" "+playStore.color+" "+playStore.ownerName+" "+playStore.isInternetRequired);
		
		PlayStore social= new PlayStore();
		System.out.println("Reference variable for playStore is created");
		social.name="Instagram";
		social.color="MaroonRed";
		social.ownerName="Kevin Systrom";
		social.isInternetRequired=true;
		System.out.println(social.name+" "+social.color+" "+social.ownerName+" "+social.isInternetRequired);
		
		PlayStore sm= new PlayStore();
		System.out.println("Reference variable for playStore is created");
		sm.name="Instagram";
		sm.color="MaroonRed";
		sm.ownerName="Kevin Systrom";
		sm.isInternetRequired=true;
		System.out.println(sm.name+" "+sm.color+" "+sm.ownerName+" "+sm.isInternetRequired);
		
		PlayStore pubg= new PlayStore();
		System.out.println("Reference variable for playStore is created");
		pubg.name="BattleGroundsMobileIndia";
		pubg.color="Tricolour";
		pubg.ownerName="Krafton";
		pubg.isInternetRequired=true;
		pubg.sizeInGb=1.02;
		System.out.println(sm.name+" "+sm.color+" "+sm.ownerName+" "+sm.isInternetRequired+" "+pubg.sizeInGb);
		
		
		System.out.println("Outside main method");
	}
}