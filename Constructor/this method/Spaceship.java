class Spaceship {
    public Spaceship() {
        this("StarX");
    }

    public Spaceship(String name) {
        this(name, "Explorer-1");
    }

    public Spaceship(String name, String model) {
        this(name, model, "Ion Engine");
    }

    public Spaceship(String name, String model, String engineType) {
        this(name, model, engineType, 5);
    }

    public Spaceship(String name, String model, String engineType, int crewCapacity) {
        this(name, model, engineType, crewCapacity, 25000);
    }

    public Spaceship(String name, String model, String engineType, int crewCapacity, int maxSpeed) {
        this(name, model, engineType, crewCapacity, maxSpeed, 2045);
    }

    public Spaceship(String name, String model, String engineType, int crewCapacity, int maxSpeed, int launchYear) {
        this(name, model, engineType, crewCapacity, maxSpeed, launchYear, true);
    }

    public Spaceship(String name, String model, String engineType, int crewCapacity, int maxSpeed, int launchYear, boolean isWarpDriveEnabled) {
        System.out.println("==== Spaceship Details ====");
        System.out.println("Name = " + name);
        System.out.println("Model = " + model);
        System.out.println("Engine Type = " + engineType);
        System.out.println("Crew Capacity = " + crewCapacity);
        System.out.println("Max Speed = " + maxSpeed + " km/h");
        System.out.println("Launch Year = " + launchYear);
        System.out.println("Warp Drive Enabled = " + isWarpDriveEnabled);
    }
}
