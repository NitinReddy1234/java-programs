class TransportTester
{
	public static void main(String a[])
	{
		Transportation transport= new Transportation();
		transport.name="RoadWays";
		transport.mode="On Road";
		transport.capacity=50;
		transport.fuelUsed="Petrol and Diesel";
		transport.station="Bus Stop";
		System.out.println(transport.name+" "+transport.mode+" "+transport.capacity+" "+transport.fuelUsed+" "+transport.station);
		
		Transportation airLine= new Transportation();
		airLine.name="AirWays";
		airLine.mode="In Air";
		airLine.capacity=200;
		airLine.fuelUsed="White Kerosine";
		airLine.station="AirPort";
		System.out.println(airLine.name+" "+airLine.mode+" "+airLine.capacity+" "+airLine.fuelUsed+" "+airLine.station);
		
		Transportation.getInfo();
		Transportation.info();
	}
	
}