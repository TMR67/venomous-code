class CharactersRunner {
    public static void main(String[] args) {
        Characters characters = new Characters(20, "Neel");
        Movie movie = new Movie("KGF", 'A', characters);
        Hero hero = new Hero("Yash", characters);
        Villain villain = new Villain(2, characters);

        movie.movieDetails();
        hero.heroDetails();
        villain.villainDetails();
    }
}