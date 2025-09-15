class ShowRoomRunner{
	public static void main(String [] args){
		ShowRoom showRoom=new ShowRoom();
		
		Bikes firstBikesData=new Bikes("Hero Splender plus",80.000d);
		Bikes secondBikesData=new Bikes("Royal Enfield",1.50000d);
		Bikes thirdBikesData=new Bikes("TVS Rider",1.30000d);
		Bikes fourthBikesData=new Bikes("Yamaha FZ",1.45000);
		Bikes fifthBikesData=new Bikes("Honda SP 125",1.35000d);
		
		
		Bikes[] bikes={firstBikesData,secondBikesData,thirdBikesData,
		                        fourthBikesData,fifthBikesData};
		
		showRoom.showRoomDisplay(bikes);
	}
}