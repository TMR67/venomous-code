class Electronics extends Product {
	
	public void describe(String productName) {
		System.out.println("It's an Electronics (Derived class) method");
		System.out.println("Product Name: " + productName);
	}

	public void describe(int quantityInStock) {
		System.out.println("Quantity in Stock: " + quantityInStock);
	}
	
	public void describe(long barcode) {
		System.out.println(barcode);
	}
	
	public void describe(float weightLbs) {
		System.out.println(weightLbs);
	}
	
	public void describe(double price) {
		System.out.println(price);
	}

	public void showWarranty(char durationCode) {
		System.out.println("Warranty Duration (Code): " + durationCode);
		}

	public void showBatteryStatus(boolean requiresBatteries) {
		System.out.println("Requires Batteries: " + requiresBatteries);
	}
}