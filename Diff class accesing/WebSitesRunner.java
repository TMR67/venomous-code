class WebSitesRunner{
	public static void main(String [] args){
		
		WebSites webSites=new WebSites();
		
		ECommerce firstWebsite=new ECommerce("Amezone",'A');
		ECommerce secondWebsite=new ECommerce("Flipkart",'A');
		ECommerce thirdWebsite=new ECommerce("Mishow",'B');
		ECommerce fourthWebsite=new ECommerce("Walmart",'A');
		ECommerce fifthWebsite=new ECommerce("Shopify",'B');
		
		
		ECommerce [] eCommerce={firstWebsite,secondWebsite,thirdWebsite,fourthWebsite,fifthWebsite};
		
		webSites.webSitesDisplay(eCommerce);
	}
}