class Ultrabook {
    public String brand;
    public String modelName;
    public Processor processor;
    public GraphicsCard gpu;
    public Storage storage;
    
    public Ultrabook(String brand, String modelName, Processor processor, GraphicsCard gpu, Storage storage) {
        this.brand = brand;
        this.modelName = modelName;
        this.processor = processor;
        this.gpu = gpu;
        this.storage = storage;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Processor: " + processor.model + " (" + processor.coreCount + " cores)");
        System.out.println("Graphics Card: " + gpu.model + " (" + gpu.vramGB + "GB VRAM)");
        System.out.println("Storage: " + storage.type + " (" + storage.capacityGB + "GB)");
    }
}