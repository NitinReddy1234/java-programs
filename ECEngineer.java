class ECEngineer extends Engineer{
	
	Constants branch =Constants.EC;
	
	@Override
	public void problemSolving(){
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void electronicEquipment(){
		System.out.println(this.branch+"consists of dealing with networking,integration" );
	}
	
	public Constants getBranch(){
		return branch;
	}
}