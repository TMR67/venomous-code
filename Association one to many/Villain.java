class Villain {
    public int noOfVillains;
    public Characters characters;

    public Villain(int noOfVillains, Characters characters) {
        this.noOfVillains = noOfVillains;
        this.characters = characters;
    }

    public void villainDetails() {
        System.out.println("No. of Villains: " + noOfVillains);
        System.out.println("Villain Character: " + characters.charactersName);
    }
}