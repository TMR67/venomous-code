class Planet extends SolarSystem {
    public double orbitalPeriodDays;
    public double avgTempCelsius;
    public boolean hasRings;
    public float surfaceGravity;
    public long population;
    public boolean isGasGiant;
    public char atmosphereComposition;

    public Planet(String name, double massKg, int moons,
                  long discoveryYear, boolean isStar, char bodyType, float orbitalInclinationDegrees,
                  double orbitalPeriodDays, double avgTempCelsius, boolean hasRings,
                  float surfaceGravity, long population, boolean isGasGiant, char atmosphereComposition) {
        
        super.name = name;
        super.massKg = massKg;
        super.moons = moons;
        super.discoveryYear = discoveryYear;
        super.isStar = isStar;
        super.bodyType = bodyType;
        super.orbitalInclinationDegrees = orbitalInclinationDegrees;

        this.orbitalPeriodDays = orbitalPeriodDays;
        this.avgTempCelsius = avgTempCelsius;
        this.hasRings = hasRings;
        this.surfaceGravity = surfaceGravity;
        this.population = population;
        this.isGasGiant = isGasGiant;
        this.atmosphereComposition = atmosphereComposition;
    }
    
    public void displayPlanet() {
        System.out.println("Planet: " + super.name + " | Type: " + super.bodyType);
        System.out.println("Mass: " + super.massKg + " kg | Moons: " + super.moons);
        System.out.println("Orbital Period: " + this.orbitalPeriodDays + " days | Orbital Inclination: " + super.orbitalInclinationDegrees + " degrees");
        System.out.println("Rings: " + this.hasRings + " | Surface Gravity: " + this.surfaceGravity + " m/s^2");
    }
}