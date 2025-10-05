class Library {
    
    public void libraryDisplay(Books[] books) {

        System.out.println("--- Library Catalog ---");
        for (int bookk = 0; bookk < books.length; bookk++) {
            Books bookDetails = books[bookk];
            System.out.println("\nBook " + (bookk + 1) + ":");
            bookDetails.bookDisplay();
        }
    }
}