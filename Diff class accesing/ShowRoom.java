class ShowRoom{
	public void showRoomDisplay(Bikes[] bikes){
		for(int details=0; details<bikes.length; details++){
			Bikes data=bikes[details];
			data.bikeDisplay();
		}
	}
	
}