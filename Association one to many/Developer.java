class Developer {
    public String developerName;
    public Player player;
    public Developer(String developerName,Player player) {
        this.developerName = developerName;
		 this.player = player;
    }

    public void developerDetails() {
        System.out.println("Developer: " + developerName+" and player name is:"+player.playerName);
    }
}
