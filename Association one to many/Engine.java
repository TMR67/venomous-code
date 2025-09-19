class Engine {
    public String engineType;
    public double horsepower;
    public Vehicle vehicle;

    public Engine(String engineType, double horsepower, Vehicle vehicle) {
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.vehicle = vehicle;
    }

    public void engineDetails() {
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horsepower: " + horsepower + " hp");
        System.out.println("Part of Vehicle: " + vehicle.modelName);
    }
}