class Mobile {
	
	public void displaySpec(String brand) {
		System.out.println("It's a Mobile (Base class) method");
		System.out.println("Brand: " + brand);
	}

	public void displaySpec(int ramGB) {
		System.out.println("RAM (GB): " + ramGB);
	}

	public void displaySpec(long imeiNumber) {
		System.out.println("IMEI Number: " + imeiNumber);
	}

	public void displaySpec(float screenSizeInches) {
		System.out.println("Screen Size (in): " + screenSizeInches);
	}

	public void displaySpec(double price) {
		System.out.println("Price (USD): " + price);
	}

	public void displaySpec(char colorCode) {
		System.out.println("Color Code: " + colorCode);
	}

	public void displaySpec(boolean hasSDSlot) {
		System.out.println("Has Expandable Storage: " + hasSDSlot);
	}
}