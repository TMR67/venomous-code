class FootballClub {
    public String clubName;
    public FootballPlayers players;
    public FootballKit kit;

    public FootballClub(String clubName, FootballPlayers players, FootballKit kit) {
        this.clubName = clubName;
        this.players = players;
        this.kit = kit;
    }

    public void displayDetails() {
        System.out.println("Club Name: " + clubName);
        System.out.println("Forwards: " + players.forwards);
        System.out.println("Midfielders: " + players.midfielders);
        System.out.println("Goalkeeper: " + players.goalkeeper);
        System.out.println("Jersey Brand: " + kit.jerseyBrand);
        System.out.println("Ball Brand: " + kit.ballBrand);
    }
}