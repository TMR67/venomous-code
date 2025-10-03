class Car {
    public String carModel;
    public Engine engine;
    public Chassis chassis;
    public Wheel wheel;

    public Car(String carModel, Engine engine, Chassis chassis, Wheel wheel) {
        this.carModel = carModel;
        this.engine = engine;
        this.chassis = chassis;
        this.wheel = wheel;
    }

    public void carDetails() {
        System.out.println("Model of the Car is " + carModel);
        System.out.println("The engine is a " + engine.engineType);
        System.out.println("The chassis is made of " + chassis.chassisMaterial);
        System.out.println("The wheel brand is " + wheel.wheelBrand + " and size is " + wheel.sizeInInches + " inches");
    }
}
