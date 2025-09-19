class Suspension {
    public String suspensionType;
    public String stiffness;
    public Vehicle vehicle;

    public Suspension(String suspensionType, String stiffness, Vehicle vehicle) {
        this.suspensionType = suspensionType;
        this.stiffness = stiffness;
        this.vehicle = vehicle;
    }

    public void suspensionDetails() {
        System.out.println("Suspension Type: " + suspensionType);
        System.out.println("Stiffness: " + stiffness);
        System.out.println("Belongs to Vehicle: " + vehicle.modelName);
    }
}