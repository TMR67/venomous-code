class Cord {
    public double lengthInFeet;
    public String color;
    public Appliance appliance;

    public Cord(double lengthInFeet, String color, Appliance appliance) {
        this.lengthInFeet = lengthInFeet;
        this.color = color;
        this.appliance = appliance;
    }

    public void cordDetails() {
        System.out.println("Cord Length: " + lengthInFeet + " feet");
        System.out.println("Cord Color: " + color);
        System.out.println("Belongs to Appliance: " + appliance.applianceName);
    }
}















