class Items{
	public void itemsDisplay(OnlineOrders[] onlineOrders){
		
		for(int deatails=0; deatails<onlineOrders.length; deatails++){
			OnlineOrders data=onlineOrders[deatails];
			data.onlineOrdersDisplay();
		}
	}
}