class RocketRunner {
    public static void main(String[] args) {
        Engine falcon9Engine = new Engine("Merlin", 845);
        Payload falcon9Payload = new Payload("Starlink Satellites", 22800);
        Body falcon9Body = new Body("Aluminum-lithium alloy", 2);
        Rocket falcon9 = new Rocket("Falcon 9", falcon9Engine, falcon9Payload, falcon9Body);

        Engine saturnVEngine = new Engine("F-1", 7740);
        Payload saturnVPayload = new Payload("Apollo Spacecraft", 43500);
        Body saturnVBody = new Body("Aluminum alloy", 3);
        Rocket saturnV = new Rocket("Saturn V", saturnVEngine, saturnVPayload, saturnVBody);

        falcon9.displayDetails();
        System.out.println("-------------------------");
        saturnV.displayDetails();
    }
}