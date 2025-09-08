class Book {
    public Book() {
        this("Java Programming");
    }

    public Book(String title) {
        this(title, "James Gosling");
    }

    public Book(String title, String author) {
        this(title, author, "Programming");
    }

    public Book(String title, String author, String genre) {
        this(title, author, genre, 450);
    }

    public Book(String title, String author, String genre, int pages) {
        this(title, author, genre, pages, "English");
    }

    public Book(String title, String author, String genre, int pages, String language) {
        this(title, author, genre, pages, language, 799.99);
    }

    public Book(String title, String author, String genre, int pages, String language, double price) {
        this(title, author, genre, pages, language, price, true);
    }

    public Book(String title, String author, String genre, int pages, String language, double price, boolean isAvailable) {
        System.out.println("==== Book Details ====");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Genre = " + genre);
        System.out.println("Pages = " + pages);
        System.out.println("Language = " + language);
        System.out.println("Price = ₹" + price);
        System.out.println("Available = " + isAvailable);
    }
}
