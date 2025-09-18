class MovieRunner {
    public static void main(String[] args) {
        Director director = new Director("Christopher Nolan", 20);
        Movie movie = new Movie("Inception", 8.8, director);
        movie.movieDetails();
    }
}
