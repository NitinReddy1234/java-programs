class Continent{
	
	int area;
	String location;
	
	
	public Continent(){
		System.out.println("Continent object is created");
	}
	
	public void landmasses(){
		System.out.println("A continent is one of several large landmasses.");
	}
	
	public void setArea(int area){
		this.area=area;
	}
	
	public int getArea(){
		return area;
	}
	
	public void setLocation(String location){
		this.location=location;
	}
	
	public String getlocation(){
		return location;
	}
	
	public void setIsLargest(boolean isLargest){
		this.isLargest=isLargest;
	}
	
	public boolean getIsLargest(){
		return isLargest;
	}

}