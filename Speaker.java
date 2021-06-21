class Speaker
{
	public static String name="Boat";
	public static String color="Black";
	public static int minVol=0;
	public static int curVol=0;
	public static int maxVol=15;
	public static boolean connected;
	
	
	public static void main(String a[])
	{
		System.out.println("Name of the Speaker is : "+name);
		System.out.println("The color of the Speaker is : "+color);
		onOrOff();
		increaseVolume();
		decreaseVolume();
	}	
	
	public static void onOrOff()
	{
		System.out.println("The Speaker is Off");
		if(connected==false)
		{		
			connected=true;
		System.out.println("The speaker is turned ON");
		}
		else
			System.out.println("The Speaker if Off");
	}
	public static void increaseVolume()
	{
		if(connected==true)
		{
			System.out.println("The Speaker is turned ON");
			if(curVol<maxVol)
			{
				System.out.println("The current volume of the Speaker is Low");
				curVol+=1;       //curVol=curVol+1;
				System.out.println("The Volume of the Speaker is : "+curVol);
			}
			else
				System.out.println("The Speaker reached Maximum Volume");
		}
		else
			System.out.println("The Speaker is in OFF state");
	}
	public static void decreaseVolume()
	{
		if(connected==true)
		{
			System.out.println("The Speaker is turned ON");
			if(curVol==maxVol)
			{
				System.out.println("The current volume of the Speaker is High");
				curVol-=1;       //curVol=curVol-1;
				System.out.println("The Volume of the Speaker is : "+curVol);
			}
			else
				System.out.println("The Speaker Volume is Low");
		}
		else
			System.out.println("The Speaker is in OFF state");
	}
}