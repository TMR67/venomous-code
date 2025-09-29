class FootballClubRunner {
    public static void main(String[] args) {
        FootballPlayers realMadridPlayers = new FootballPlayers("Vinícius Júnior, Kylian Mbappé", "Jude Bellingham, Luka Modrić", "Éder Militão, Dani Carvajal", "Thibaut Courtois");
        FootballKit realMadridKit = new FootballKit("Adidas", "Adidas");
        FootballClub realMadrid = new FootballClub("Real Madrid CF", realMadridPlayers, realMadridKit);

        FootballPlayers manCityPlayers = new FootballPlayers("Erling Haaland, Julián Álvarez", "Kevin De Bruyne, Rodri", "Rúben Dias, Kyle Walker", "Ederson");
        FootballKit manCityKit = new FootballKit("Puma", "Nike");
        FootballClub manchesterCity = new FootballClub("Manchester City FC", manCityPlayers, manCityKit);

        realMadrid.displayDetails();
        System.out.println();
        manchesterCity.displayDetails();
    }
}