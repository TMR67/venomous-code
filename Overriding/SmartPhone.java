class SmartPhone extends Mobile {
	
	public void displaySpec(String brand) {
		System.out.println("It's a SmartPhone (Derived class) method");
		System.out.println("Brand: " + brand);
	}

	public void displaySpec(int ramGB) {
		System.out.println("RAM (GB): " + ramGB);
	}
	
	public void displaySpec(long imeiNumber) {
		System.out.println(imeiNumber);
	}
	
	public void displaySpec(float screenSizeInches) {
		System.out.println(screenSizeInches);
	}
	
	public void displaySpec(double price) {
		System.out.println(price);
	}

	public void displayCameraMP(char mpCode) {
		System.out.println("Main Camera MP Code: " + mpCode);
	}

	public void displayBiometric(boolean hasFingerprintSensor) {
		System.out.println("Has Fingerprint Sensor: " + hasFingerprintSensor);
	}
}