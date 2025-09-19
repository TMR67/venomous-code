class Game {
    public String gameName;
    public char rating;
    public Player player;

    public Game(String gameName, char rating, Player player) {
        this.gameName = gameName;
        this.rating = rating;
        this.player = player;
    }

    public void gameDetails() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Rating: " + rating);
        System.out.println("Main Player Name: " + player.playerName);
        System.out.println("Player Role: " + player.role);
    }
}





