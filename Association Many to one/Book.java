class Book {
    public String title;
    public Author author;
    public Publisher publisher;
    public Content content;

    public Book(String title, Author author, Publisher publisher, Content content) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.content = content;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author.name + " (Published " + author.booksPublished + " books)");
        System.out.println("Publisher: " + publisher.name + " (" + publisher.location + ")");
        System.out.println("Genre: " + content.genre);
        System.out.println("Page Count: " + content.pageCount);
    }
}