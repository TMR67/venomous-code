class SolarSystemRunner {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.972e24, 1,
                                 -4500000000L, false, 'P', 23.44f,
                                 365.25, 15.0, false,
                                 9.81f, 8100000000L, false, 'N');
        earth.displayPlanet();
    }
}