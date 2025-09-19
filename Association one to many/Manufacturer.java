class Manufacturer {
    public String manufacturerName;
    public Appliance appliance;

    public Manufacturer(String manufacturerName, Appliance appliance) {
        this.manufacturerName = manufacturerName;
        this.appliance = appliance;
    }

    public void manufacturerDetails() {
        System.out.println("Manufacturer: " + manufacturerName + " for " + appliance.applianceName);
    }
}