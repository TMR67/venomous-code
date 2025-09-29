class Smartphone {
    public String brand;
    public Screen screen;
    public Camera camera;
    public Battery battery;

    public Smartphone(String brand, Screen screen, Camera camera, Battery battery) {
        this.brand = brand;
        this.screen = screen;
        this.camera = camera;
        this.battery = battery;
    }

    public void displayDetails() {
        System.out.println("Smartphone Brand: " + brand);
        System.out.println("Screen: " + screen.sizeInInches + " inch " + screen.displayType);
        System.out.println("Camera: " + camera.megapixels + "MP with " + camera.numberOfLenses + " lenses");
        System.out.println("Battery Capacity: " + battery.capacityMah + " mAh");
        System.out.println("Fast Charging: " + (battery.fastChargingSupport ? "Yes" : "No"));
    }
}