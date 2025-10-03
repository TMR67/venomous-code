class CarRunner {
    public static void main(String[] args) {

        Engine engine = new Engine("V6 Turbo");
        Chassis chassis = new Chassis("Aluminum Alloy");
        Wheel wheel = new Wheel("Michelin", 18);
        Car car = new Car("Sports X-900", engine, chassis, wheel);

        car.carDetails();
    }
}