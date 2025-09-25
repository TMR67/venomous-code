class Bike extends Vehicle {
    public int gears;
    public String color;
    public char bikeType;
    public double cost;
    public long contactNo;
    public float mileage;
    public boolean isOffRoad;

    public Bike(int wheels, String brand, double weight, long vehicleId,
                float topSpeed, boolean isElectric, char vehicleType,
                int gears, String color, char bikeType, double cost,
                long contactNo, float mileage, boolean isOffRoad) {

        super.wheels = wheels;
        super.brand = brand;
        super.weight = weight;
        super.vehicleId = vehicleId;
        super.topSpeed = topSpeed;
        super.isElectric = isElectric;
        super.vehicleType = vehicleType;

        this.gears = gears;
        this.color = color;
        this.bikeType = bikeType;
        this.cost = cost;
        this.contactNo = contactNo;
        this.mileage = mileage;
        this.isOffRoad = isOffRoad;
    }
	  public void displayBike() {
        System.out.println("Brand: " + super.brand + " | Wheels: " + super.wheels);
        System.out.println("Weight: " + super.weight + " kg | Top Speed: " + super.topSpeed + " km/h");
        System.out.println("Gears: " + this.gears + " | Color: " + this.color);
        System.out.println("Cost: " + this.cost + " | Mileage: " + this.mileage + " km/l");
        System.out.println("Is Electric: " + super.isElectric + " | Is Off-Road: " + this.isOffRoad);
    }


}