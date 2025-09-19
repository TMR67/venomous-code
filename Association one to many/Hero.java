class Hero {
    public String heroName;
    public Characters characters;

    public Hero(String heroName, Characters characters) {
        this.heroName = heroName;
        this.characters = characters;
    }

    public void heroDetails() {
        System.out.println("Hero Name: " + heroName);
        System.out.println("Hero Character: " + characters.charactersName);
    }
}