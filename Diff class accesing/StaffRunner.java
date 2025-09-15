class StaffRunner{
	public static void main(String [] args){
		Staff staff=new Staff();
		
		School firstSchoolData=new School("Akash",32);
		School secondSchoolData=new School("presidency",45);
		School thirdSchoolData=new School("JSS",62);
		School fourthSchoolData=new School("RTES",29);
		School fifthSchoolData=new School("KLE",35);
		
		School[] schoolData={firstSchoolData,secondSchoolData,thirdSchoolData,
		                           fourthSchoolData,fifthSchoolData};
		
		staff.staffDisplay(schoolData);
	}
}