class Laptop {
	public void displayLaptopDetails(String brand) {
		System.out.println("Laptop Brand: " + brand);
	}
	public void displayLaptopDetails(String brand, String model) {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
	}
	public void displayLaptopDetails(String brand, String model, double screenSize) {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
		System.out.println("Screen Size: " + screenSize + " inches");
	}
	public void displayLaptopDetails(String brand, String model, double screenSize, int ramGB) {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
		System.out.println("Screen Size: " + screenSize + " inches");
		System.out.println("RAM: " + ramGB + "GB");
	}
	public void displayLaptopDetails(String brand, String model, double screenSize, int ramGB, int storageGB) {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
		System.out.println("Screen Size: " + screenSize + " inches");
		System.out.println("RAM: " + ramGB + "GB");
		System.out.println("Storage: " + storageGB + "GB");
	}
	public void displayLaptopDetails(String brand, String model, double screenSize, int ramGB, int storageGB,
	                                 double processorSpeedGhz) {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
		System.out.println("Screen Size: " + screenSize + " inches");
		System.out.println("RAM: " + ramGB + "GB");
		System.out.println("Storage: " + storageGB + "GB");
		System.out.println("Processor Speed: " + processorSpeedGhz + " GHz");
	}
	public void displayLaptopDetails(String brand, String model, double screenSize, int ramGB, int storageGB,
	                                 double processorSpeedGhz, boolean hasTouchscreen) {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
		System.out.println("Screen Size: " + screenSize + " inches");
		System.out.println("RAM: " + ramGB + "GB");
		System.out.println("Storage: " + storageGB + "GB");
		System.out.println("Processor Speed: " + processorSpeedGhz + " GHz");
		System.out.println("Has Touchscreen: " + hasTouchscreen);
	}
}

// LaptopRunner class to demonstrate the overloaded methods
class LaptopRunner {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        
        System.out.println("--- Displaying with brand only ---");
        myLaptop.displayLaptopDetails("Dell");
        
        System.out.println("\n--- Displaying with brand and model ---");
        myLaptop.displayLaptopDetails("Dell", "XPS 15");
        
        System.out.println("\n--- Displaying with screen size ---");
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6);
        
        System.out.println("\n--- Displaying with RAM ---");
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32);
        
        System.out.println("\n--- Displaying with storage ---");
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32, 1000);
        
        System.out.println("\n--- Displaying with processor speed ---");
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32, 1000, 2.3);
        
        System.out.println("\n--- Displaying with all details ---");
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32, 1000, 2.3, true);
    }
}