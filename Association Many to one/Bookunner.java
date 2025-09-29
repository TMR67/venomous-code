class BookRunner {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", 13);
        Publisher publisher = new Publisher("Bloomsbury Publishing", "London");
        Content content = new Content("Fantasy", 223);
        Book book = new Book("Harry Potter and the Philosopher's Stone", author, publisher, content);

        book.displayDetails();
    }
}