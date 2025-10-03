class BookRunner {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "Fantasy");

        Book book = new Book("Harry Potter and the Sorcerer's Stone", 'A', author);
        Review review = new Review(1500, "5-Star Rating", author);
        Chapter chapter = new Chapter("The Boy Who Lived", 20, author);
        Publisher publisher = new Publisher("Bloomsbury Publishing", author);

        book.bookDetails();
        
        review.reviewDetails();
        chapter.chapterDetails();
        publisher.publisherDetails();
    }
}