class ElectricalRunner {
    public static void main(String[] args) {
        Appliance myAppliance = new Appliance("Toaster Oven", 1200.5);
        Component myComponent = new Component("Heating Element", "Resistor", myAppliance);
        Manufacturer myManufacturer = new Manufacturer("Toast-a-matic Inc.", myAppliance);
        PowerSource myPowerSource = new PowerSource("Wall Outlet", 120.0, myAppliance);
        Certification myCertification = new Certification("Underwriters Laboratories", "UL-12345", myAppliance);
        Cord myCord = new Cord(3.5, "Black", myAppliance);
		
        myComponent.componentDetails();
        myManufacturer.manufacturerDetails();
        myPowerSource.powerSourceDetails();
        myCertification.certificationDetails();
		myCord.cordDetails();
    }
}