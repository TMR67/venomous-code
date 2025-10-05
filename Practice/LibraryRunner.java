class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();

        Books bookOne = new Books("978-0321765723", "The Lord of the Rings");
        Books bookTwo = new Books("978-1503258593", "Pride and Prejudice");
        Books bookThree = new Books("978-0743273565", "The Great Gatsby");
        Books bookFour = new Books("978-0061120084", "To Kill a Mockingbird");

        Books[] books = {bookOne, bookTwo, bookThree, bookFour};

        library.libraryDisplay(books);
    }
}