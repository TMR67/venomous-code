class Laptop extends Computer {
    public double screenSizeInches;
    public int batteryLifeHours;
    public boolean hasTouchScreen;
    public float weightKg;
    public String graphicCard;
    public long storageGb;
    public char coolingSystem;
    
    public Laptop(String brand, String os, double processorSpeedGHz, int ramGb,
                  long serialNumber, float price, boolean isDesktop,
                  double screenSizeInches, int batteryLifeHours, boolean hasTouchScreen,
                  float weightKg, String graphicCard, long storageGb, char coolingSystem) {

        super.brand = brand;
        super.os = os;
        super.processorSpeedGHz = processorSpeedGHz;
        super.ramGb = ramGb;
        super.serialNumber = serialNumber;
        super.price = price;
        super.isDesktop = isDesktop;
        
        this.screenSizeInches = screenSizeInches;
        this.batteryLifeHours = batteryLifeHours;
        this.hasTouchScreen = hasTouchScreen;
        this.weightKg = weightKg;
        this.graphicCard = graphicCard;
        this.storageGb = storageGb;
        this.coolingSystem = coolingSystem;
    }
    
    public void displayLaptop() {
        System.out.println("Brand: " + super.brand + " | OS: " + super.os);
        System.out.println("Processor Speed: " + super.processorSpeedGHz + " GHz | RAM: " + super.ramGb + " GB");
        System.out.println("Screen Size: " + this.screenSizeInches + " inches | Battery Life: " + this.batteryLifeHours + " hours");
        System.out.println("Price: $" + super.price + " | Weight: " + this.weightKg + " kg");
        System.out.println("Touchscreen: " + this.hasTouchScreen + " | Cooling: " + this.coolingSystem);
    }
}