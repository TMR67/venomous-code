class Property {
    public static void address() {
        System.out.println("Shivamogga");
    }
    public static void city() {
        System.out.println("Thirthahalli");
    }
    public static void state() {
        System.out.println("Karnataka");
    }
    public static void pinCode() {
        System.out.println("577432");
    }
    public static void type() {
        System.out.println("House");
    }
    public static void bedrooms() {
        System.out.println("4");
    }
    public static void bathrooms() {
        System.out.println("3");
    }
    public static void squareFootage() {
        System.out.println("2500");
    }
    public static void yearBuilt() {
        System.out.println("2005");
    }
    public static void price() {
        System.out.println("550000");
    }
}

class Apartment extends Property {
}

class PropertyRunner {
    public static void main(String[] args) {
        Apartment myApartment = new Apartment();
        myApartment.address();
        myApartment.city();
        myApartment.state();
        myApartment.pinCode();
        myApartment.type();
        myApartment.bedrooms();
        myApartment.bathrooms();
        myApartment.squareFootage();
        myApartment.yearBuilt();
        myApartment.price();
    }
}