class Airline {
    public String airlineName;
    public String flightNo;
    public Pilot pilot;

    public Airline(String airlineName, String flightNo, Pilot pilot) {
        this.airlineName = airlineName;
        this.flightNo = flightNo;
        this.pilot = pilot;
    }

    public void airlineDetails() {
        System.out.println("Airline: " + airlineName);
        System.out.println("Flight No: " + flightNo);
        System.out.println("Pilot Name: " + pilot.pilotName);
        System.out.println("Experience: " + pilot.experience + " years");
    }
}

