class GPS {
    public double latitude;
    public double longitude;
    public Vehicle vehicle;

    public GPS(double latitude, double longitude, Vehicle vehicle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.vehicle = vehicle;
    }

    public void gpsDetails() {
        System.out.println("GPS Location for " + vehicle.modelName + ":");
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}