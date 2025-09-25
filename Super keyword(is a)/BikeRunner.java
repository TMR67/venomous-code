class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike(2, "Yamaha", 150.5, 303L, 160.0f, false, 'S',
                            5, "Blue", 'S', 150000.0,
                            9988776655L, 45.5f, false);
        bike.displayBike();
    }
}