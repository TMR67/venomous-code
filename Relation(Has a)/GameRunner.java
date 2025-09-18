class GameRunner {
    public static void main(String[] args) {
        Player player = new Player("ThEJA", 70);
        Game game = new Game("Free Fire", "Battle Royale", player);
        game.gameDetails();
    }
}