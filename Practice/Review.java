class Review {
    public int noOfReviews;
    public String reviewType;
    public Author author; 

    public Review(int noOfReviews, String reviewType, Author author) {
        this.noOfReviews = noOfReviews;
        this.reviewType = reviewType;
        this.author = author;
    }

    public void reviewDetails() {
        System.out.println("No. of Reviews: " + noOfReviews);
        System.out.println("Review Type: " + reviewType + " | Author genre: " + author.genre);
    }
}