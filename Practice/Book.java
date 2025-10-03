class Book {
    public String bookTitle;
    public char rating;
    public Author author;

    public Book(String bookTitle, char rating, Author author) {
        this.bookTitle = bookTitle;
        this.rating = rating;
        this.author = author;
    }

    public void bookDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("User Rating: " + rating);
        System.out.println("Main Author Name: " + author.authorName);
        System.out.println("Author Genre: " + author.genre);
    }
}