class TimeMachine {
    public TimeMachine() {
        this("ChronoX");
    }

    public TimeMachine(String name) {
        this(name, "Mark-I");
    }

    public TimeMachine(String name, String model) {
        this(name, model, "Quantum Reactor");
    }

    public TimeMachine(String name, String model, String powerSource) {
        this(name, model, powerSource, 1);
    }

    public TimeMachine(String name, String model, String powerSource, int passengerCapacity) {
        this(name, model, powerSource, passengerCapacity, "2050-01-01");
    }

    public TimeMachine(String name, String model, String powerSource, int passengerCapacity, String defaultYear) {
        this(name, model, powerSource, passengerCapacity, defaultYear, "Past & Future");
    }

    public TimeMachine(String name, String model, String powerSource, int passengerCapacity, String defaultYear, String travelRange) {
        this(name, model, powerSource, passengerCapacity, defaultYear, travelRange, true);
    }

    public TimeMachine(String name, String model, String powerSource, int passengerCapacity, String defaultYear, String travelRange, boolean isParadoxSafe) {
        System.out.println("==== Time Machine Details ====");
        System.out.println("Name = " + name);
        System.out.println("Model = " + model);
        System.out.println("Power Source = " + powerSource);
        System.out.println("Passenger Capacity = " + passengerCapacity);
        System.out.println("Default Year = " + defaultYear);
        System.out.println("Travel Range = " + travelRange);
        System.out.println("Paradox Safe = " + isParadoxSafe);
    }
}

