class VehicleRunner {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Sedan S", 2023);
        Engine myEngine = new Engine("V8", 450.0, myCar);
        Manufactur myManufacturer = new Manufactur("Swift Motors", myCar);
        Tire myTire = new Tire("Goodride", "All-Season", myCar);
        GPS myGPS = new GPS(34.0522, -118.2437, myCar);
        Suspension mySuspension = new Suspension("Double Wishbone", "Sport", myCar);
        Transmission myTransmission = new Transmission("Automatic", 8, myCar);

        myEngine.engineDetails();
        myManufacturer.manufacturerDetails();
        myTire.tireDetails();
        myGPS.gpsDetails();
        mySuspension.suspensionDetails();
        myTransmission.transmissionDetails();
    }
}