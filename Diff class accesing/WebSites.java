class WebSites{
	public void webSitesDisplay(ECommerce[] eCommerce){
		
		for(int details=0; details<eCommerce.length; details++){
			
			ECommerce data=eCommerce[details];
			data.eCommerceDisplay();
		}
		
		
	}
}