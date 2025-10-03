class House extends Building {
    public int bedrooms;
    public String roofType;
    public char heatingSystem; 
    public double price;
    public long registrationNo;
    public float propertyTaxRate;
    public boolean hasGarage;

    public House(int floors, String address, double areaSqM, long propertyId,
                 float heightM, boolean hasElevator, char buildingType,
                 int bedrooms, String roofType, char heatingSystem, double price,
                 long registrationNo, float propertyTaxRate, boolean hasGarage) {

        super.floors = floors;
        super.address = address;
        super.areaSqM = areaSqM;
        super.propertyId = propertyId;
        super.heightM = heightM;
        super.hasElevator = hasElevator;
        super.buildingType = buildingType;

        this.bedrooms = bedrooms;
        this.roofType = roofType;
        this.heatingSystem = heatingSystem;
        this.price = price;
        this.registrationNo = registrationNo;
        this.propertyTaxRate = propertyTaxRate;
        this.hasGarage = hasGarage;
    }

    public void displayHouse() {
        System.out.println("Address: " + super.address + " | Floors: " + super.floors);
        System.out.println("Area: " + super.areaSqM + " sq.m | Height: " + super.heightM + " m");
        System.out.println("Bedrooms: " + this.bedrooms + " | Roof Type: " + this.roofType);
        System.out.println("Price: " + this.price + " | Tax Rate: " + this.propertyTaxRate + " %");
        System.out.println("Has Elevator: " + super.hasElevator + " | Has Garage: " + this.hasGarage);
    }
}