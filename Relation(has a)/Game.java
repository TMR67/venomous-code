class Game {
    public String name;
    public String genre;
    public Player player;

    public Game(String name, String genre, Player player) {
        this.name = name;
        this.genre = genre;
        this.player = player;
    }

    public void gameDetails() {
        System.out.println("Game: " + name);
        System.out.println("Player: " + player.username);
		System.out.println("Level: " + player.level);
    }
}



