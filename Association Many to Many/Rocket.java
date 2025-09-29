class Rocket {
    public String rocketName;
    public Engine engine;
    public Payload payload;
    public Body body;

    public Rocket(String rocketName, Engine engine, Payload payload, Body body) {
        this.rocketName = rocketName;
        this.engine = engine;
        this.payload = payload;
        this.body = body;
    }

    public void displayDetails() {
        System.out.println("Rocket Name: " + rocketName);
        System.out.println("Engine Type: " + engine.engineType);
        System.out.println("Engine Thrust: " + engine.thrustKn + " kN");
        System.out.println("Payload Type: " + payload.payloadType);
        System.out.println("Payload Mass: " + payload.massKg + " kg");
        System.out.println("Body Material: " + body.bodyMaterial);
        System.out.println("Number of Stages: " + body.numberOfStages);
    }
}