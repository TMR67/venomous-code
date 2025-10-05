class Animal {

    public String species;
    public String name;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public void animalDisplay() {
        System.out.println("Species: " + species);
        System.out.println("Name: " + name);
    }
}