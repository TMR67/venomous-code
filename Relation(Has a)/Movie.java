class Movie {
    public String title;
    public double rating;
    public Director director;

    public Movie(String title, double rating, Director director) {
        this.title = title;
        this.rating = rating;
        this.director = director;
    }

    public void movieDetails() {
        System.out.println("Movie: " + title);
        System.out.println("Experience: " +director.experience+" years");
        System.out.println("Directed by " + director.name);
    }
}


