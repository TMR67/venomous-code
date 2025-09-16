class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();

        LibraryBook book1 = new LibraryBook("Java Basics", 1);
        LibraryBook book2 = new LibraryBook("Python", 2);
        LibraryBook book3 = new LibraryBook("C++", 3);
        LibraryBook book4 = new LibraryBook("HTML", 4);
        LibraryBook book5 = new LibraryBook("CSS", 5);

        LibraryBook[] books = {book1, book2, book3, book4, book5};

        library.libraryDisplay(books);
    }
}
