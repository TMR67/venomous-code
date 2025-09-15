class Staff{
	public void staffDisplay(School[] schoolData){
		
		for(int details=0; details<schoolData.length; details++){
			School data=schoolData[details];
			data.schoolDisplay();
		}
		
	}
}