class Tire {
    public String brand;
    public String tireType;
    public Vehicle vehicle;

    public Tire(String brand, String tireType, Vehicle vehicle) {
        this.brand = brand;
        this.tireType = tireType;
        this.vehicle = vehicle;
    }

    public void tireDetails() {
        System.out.println("Tire Brand: " + brand);
        System.out.println("Tire Type: " + tireType);
        System.out.println("Belongs to Vehicle: " + vehicle.modelName);
    }
}