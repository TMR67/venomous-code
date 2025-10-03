class PrinterRunner {
    public static void main(String[] args) {
        Printer officePrinter = new Printer();

        officePrinter.print("Vacation-Picture.jpg", true, 600.0f, 'A');

        System.out.println("\n--- Other Print Jobs ---");

        officePrinter.print("Annual-Budget.pdf", 5);
        
        officePrinter.print("Printing complete.");
    }
}