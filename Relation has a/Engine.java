class Engine {
    public String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void engineDetails() {
        System.out.println("Engine Type = " + engineType);
    }
}

class Car {
    public String carEngine;
    public Engine engine;

    public Car(Engine engine) {
        this.carEngine = engine.engineType;
        this.engine = engine;
    }

    public void displayCar() {
        engine.engineDetails();
    }
}

class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine("V8 Petrol");
        Car car = new Car(engine);

        car.displayCar();
    }
}
