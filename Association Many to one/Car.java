class Car {
    public String brand;
    public Engine engine;
    public Wheel wheel;
    public MusicSystem musicSystem;

   
    public Car(String brand, Engine engine, Wheel wheel, MusicSystem musicSystem) {
        this.brand = brand;
        this.engine = engine;
        this.wheel = wheel;
        this.musicSystem = musicSystem;
    }

   
    public void carDetails() {
        System.out.println("Brand of the car: " + brand);
        System.out.println("Engine type: " + engine.engineType);
        System.out.println("Wheel size: " + wheel.size + " inches");
        System.out.println("Music system brand: " + musicSystem.brand +"and had  " +musicSystem.speakers + " speakers.");
      
    }
}





