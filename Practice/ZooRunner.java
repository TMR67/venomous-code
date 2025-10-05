class ZooRunner {
    public static void main(String[] args) {
        Zoo cityZoo = new Zoo();

        Animal animalOne = new Animal("Lion", "Simba");
        Animal animalTwo = new Animal("Elephant", "Jumbo");
        Animal animalThree = new Animal("Giraffe", "Stretchy");
        Animal animalFour = new Animal("Penguin", "Skipper");

        Animal[] animals = {animalOne, animalTwo, animalThree, animalFour};

        cityZoo.zooDisplay(animals);
    }
}