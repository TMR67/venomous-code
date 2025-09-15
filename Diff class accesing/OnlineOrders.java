class OnlineOrders{
	public String orderName;
	public int numberOfOrders;
	
	public OnlineOrders(String orderName,int numberOfOrders){
		
		this.orderName=orderName;
		this.numberOfOrders=numberOfOrders;
	}
	
	public void onlineOrdersDisplay(){
		System.out.println(orderName);
		System.out.println(numberOfOrders);
	}
}