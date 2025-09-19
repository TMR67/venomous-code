class Enemy {
    public int noOfEnemies;
    public String enemyType;
    public Player player;
    public Enemy(int noOfEnemies, String enemyType,Player player) {
        this.noOfEnemies = noOfEnemies;
        this.enemyType = enemyType;
		this.player=player;
    }

    public void enemyDetails() {
        System.out.println("No. of Enemies: " + noOfEnemies);
        System.out.println("Enemy Type: " + enemyType+" enemy role :" +player.role);
    }
}
