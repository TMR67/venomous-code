class GameRunner {
    public static void main(String[] args) {
        Player player = new Player("Kratos", "Warrior");
        Game game = new Game("God of War", 'A', player);
        Enemy enemy = new Enemy(5, "Titans",player);
        Weapon weapon = new Weapon("Leviathan Axe", 95,player);
        Developer developer = new Developer("Santa Monica Studio",player);

        game.gameDetails();
        
        enemy.enemyDetails();
        weapon.weaponDetails();
        developer.developerDetails();
    }
}