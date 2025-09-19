class Manufactur {
    public String manufacturerName;
    public Vehicle vehicle;

    public Manufactur(String manufacturerName, Vehicle vehicle) {
        this.manufacturerName = manufacturerName;
        this.vehicle = vehicle;
    }

    public void manufacturerDetails() {
        System.out.println("Manufacturer: " + manufacturerName + " for " + vehicle.modelName);
    }
}
