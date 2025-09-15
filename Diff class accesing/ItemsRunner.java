class ItemsRunner{
	public static void main(String [] args){
		Items items=new Items();
		
		OnlineOrders firstOnlineOrders=new OnlineOrders("Kurti",123);
		OnlineOrders secondOnlineOrders=new OnlineOrders("Suits",168);
		OnlineOrders thirdOnlineOrders=new OnlineOrders("T-Shirts",1267);
		OnlineOrders fourthOnlineOrders=new OnlineOrders("Night-Dress",1598);
		OnlineOrders fifthOnlineOrders=new OnlineOrders("Hoodies",1398);
		
		OnlineOrders[] onlineOrders={firstOnlineOrders,secondOnlineOrders,thirdOnlineOrders,
		                              fourthOnlineOrders,fifthOnlineOrders};
		
		items.itemsDisplay(onlineOrders);
	}
}