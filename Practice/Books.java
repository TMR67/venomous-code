class Books {

    public String isbn;
    public String title;

    public Books(String isbn, String title) { // Constructor uses the new name
        this.isbn = isbn;
        this.title = title;
    }

    public void bookDisplay() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
    }
}