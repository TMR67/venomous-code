class Movie {
    public String movieName;
    public char grade;
    public Characters characters;

    public Movie(String movieName, char grade, Characters characters) {
        this.movieName = movieName;
        this.grade = grade;
        this.characters = characters;
    }

    public void movieDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Grade: " + grade);
        System.out.println("No. of Characters: " + characters.noOfCharacters);
        System.out.println("Main Character Name: " + characters.charactersName);
    }
}