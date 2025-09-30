class Laptop {
    public String modelName;
    public int ramGB;
    public Processor processor;

    public Laptop(String modelName, int ramGB, Processor processor) {
        this.modelName = modelName;
        this.ramGB = ramGB;
        this.processor = processor;
    }

    public void displayLaptopDetails() {
        System.out.println("Laptop Model: " + modelName);
        System.out.println("Installed RAM: " + ramGB + "GB");
        System.out.println("CPU: " + processor.brand + " with " + processor.coreCount + " cores");
    }
}