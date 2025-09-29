class AnimalRunner {
    public static void main(String[] args) {

        Dog dog = new Dog(2, "Dog", 2.5f, 45465363L, 2000.0, 'M', true);
        dog.displayDog();
        System.out.println("------------------------------------");

        Cat cat = new Cat(3, "Whiskers", 1.2f, 9876543210L, 1500.50, 'F', true);
        cat.displayCat();
    }
}