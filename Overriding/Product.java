class Product {
	
	public void describe(String productName) {
		System.out.println("It's a Product (Base class) method");
		System.out.println("Product Name: " + productName);
	}

	public void describe(int quantityInStock) {
		System.out.println("Quantity in Stock: " + quantityInStock);
	}

	public void describe(long barcode) {
		System.out.println("Barcode: " + barcode);
	}

	public void describe(float weightLbs) {
		System.out.println("Weight (lbs): " + weightLbs);
	}

	public void describe(double price) {
		System.out.println("Price (USD): " + price);
	}

	public void describe(char rating) {
		System.out.println("Customer Rating (Code): " + rating);
	}

	public void describe(boolean isFragile) {
		System.out.println("Is Fragile: " + isFragile);
	}
}