class PowerSource {
    public String sourceName;
    public double voltage;
    public Appliance appliance;

    public PowerSource(String sourceName, double voltage, Appliance appliance) {
        this.sourceName = sourceName;
        this.voltage = voltage;
        this.appliance = appliance;
    }

    public void powerSourceDetails() {
        System.out.println("Power Source: " + sourceName);
        System.out.println("Voltage: " + voltage + "V");
        System.out.println("Powering Appliance: " + appliance.applianceName);
    }
}