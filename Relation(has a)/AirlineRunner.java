class AirlineRunner {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Capt.Manu", 15);
        Airline airline = new Airline("Air India", "AI-302", pilot);
        airline.airlineDetails();
    }
}
