class ProductRunner {
	public static void main(String [] args) {
		
		Electronics wirelessHeadphones = new Electronics();

		wirelessHeadphones.describe("Noise-Cancelling Headphones"); 
		
		wirelessHeadphones.describe(250); 
		
		wirelessHeadphones.describe(700010002000300L);
		
		wirelessHeadphones.describe(0.8f);
		
		wirelessHeadphones.describe(199.99d);
		
		wirelessHeadphones.showWarranty('Y'); 
		
		wirelessHeadphones.showBatteryStatus(true);
	}
}