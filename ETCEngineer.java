class ETCEngineer extends Engineer{
	
	Constants branch =Constants.ETC;
	
	@Override
	public void problemSolving(){
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void telephoneServices(){
		System.out.println(this.branch+" works with telephone services");
	}
	
	public Constants getBranch(){
		return branch;
	}