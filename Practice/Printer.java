class Printer {

    public void print(String message) {
        System.out.println("Operation: Printing Simple Message");
        System.out.println("Document Type: Text");
        System.out.println("Content: " + message);
    }

    public void print(String fileName, int copies) {
        System.out.println("Operation: Printing Document with Copies");
        System.out.println("File Name: " + fileName);
        System.out.println("Number of Copies: " + copies);
    }

    public void print(String reportName, int pages, double taxRate) {
        System.out.println("Operation: Printing Financial Report");
        System.out.println("Report Name: " + reportName);
        System.out.println("Total Pages: " + pages);
        System.out.println("Tax Rate Applied: " + (taxRate * 100) + "%");
    }

    public void print(String photoName, boolean inColor, float dpi, char paperSize) {
        System.out.println("Operation: Printing High-Quality Photo");
        System.out.println("Photo Name: " + photoName);
        System.out.println("In Color: " + inColor);
        System.out.println("Resolution (DPI): " + dpi);
        System.out.println("Paper Size: " + paperSize);
    }
}

