class Engineer{
	public String USN;
	public Constants branch =Constants.ARCH;
	
	public void problemSolving(){
		System.out.println("Invoked problemSolving()");
		System.out.println("problem solved");
	}
	
	public void setUSN(String USN){
		this.USN=USN;
	}
	
	
	public String getUSN(){
		return USN;
	}
	
	public Constants getBranch(){
	return branch;
	}
}