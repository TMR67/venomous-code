class Stores{
	public void storesDisplay(Mall[] mallInfo){
		
		for(int details=0; details<mallInfo.length; details++){
			Mall data=mallInfo[details];
			data.mallDisplay();
		}
		
	}
}