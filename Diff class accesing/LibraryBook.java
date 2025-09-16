class LibraryBook {
    public String bookTitle;
    public int bookId;

    public LibraryBook(String bookTitle, int bookId) {
        this.bookTitle = bookTitle;
        this.bookId = bookId;
    }

    public void libraryBookDisplay() {
        System.out.println(bookTitle);
        System.out.println(bookId);
    }
}


