class Transmission {
    public String transmissionType;
    public int numberOfGears;
    public Vehicle vehicle;

    public Transmission(String transmissionType, int numberOfGears, Vehicle vehicle) {
        this.transmissionType = transmissionType;
        this.numberOfGears = numberOfGears;
        this.vehicle = vehicle;
    }

    public void transmissionDetails() {
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Number of Gears: " + numberOfGears);
        System.out.println("Belongs to Vehicle: " + vehicle.modelName);
    }
}