class Laptop {
    public Laptop() {
        this("Dell");
    }

    public Laptop(String brand) {
        this(brand, "Inspiron");
    }

    public Laptop(String brand, String model) {
        this(brand, model, "i5");
    }

    public Laptop(String brand, String model, String processor) {
        this(brand, model, processor, 8);
    }

    public Laptop(String brand, String model, String processor, int ram) {
        this(brand, model, processor, ram, 512);
    }

    public Laptop(String brand, String model, String processor, int ram, int storage) {
        this(brand, model, processor, ram, storage, 15.6f);
    }

    public Laptop(String brand, String model, String processor, int ram, int storage, float screenSize) {
        this(brand, model, processor, ram, storage, screenSize, 75000.50);
    }

    public Laptop(String brand, String model, String processor, int ram, int storage, float screenSize, double price) {
        this(brand, model, processor, ram, storage, screenSize, price, true);
    }

    public Laptop(String brand, String model, String processor, int ram, int storage, float screenSize, double price, boolean isTouchScreen) {
        System.out.println("==== Laptop Details ====");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Processor = " + processor);
        System.out.println("RAM = " + ram + " GB");
        System.out.println("Storage = " + storage + " GB SSD");
        System.out.println("Screen Size = " + screenSize + " inches");
        System.out.println("Price = ₹" + price);
        System.out.println("Touch Screen = " + isTouchScreen);
    }
}
