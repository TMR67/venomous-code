class School{
	public String schoolName;
	public int numberOfStaffs;
	
	
	public School(String schoolName,int numberOfStaffs){
		
		this.schoolName=schoolName;
		this.numberOfStaffs=numberOfStaffs;
	}
	
	public void schoolDisplay(){
		System.out.println(schoolName);
		System.out.println(numberOfStaffs);
	}

	
}