class CarRunner {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V8");
        Wheel carWheel = new Wheel(18);
        MusicSystem carMusicSystem = new MusicSystem("Boat", 8);

        Car myCar = new Car("Mercedes-Benz", carEngine, carWheel, carMusicSystem);

        myCar.carDetails();
    }
}