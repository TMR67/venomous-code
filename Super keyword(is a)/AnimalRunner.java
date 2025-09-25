class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat("Felis catus", 4.5, 555L, 38.0f, true, 'C',
                            15,
                            "Siamese", "John Doe", 3,
                            9.5f, 987654321L, true, 'T');
        myCat.displayCat();
    }
}