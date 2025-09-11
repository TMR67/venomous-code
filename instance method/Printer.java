class Printer {
    public String[] printerBrands = {"HP", "Canon", "Epson", "Brother"};
    public void printerName() {
        System.out.println(printerBrands.length);
        for (int printer= 0; i < printerBrands.length; printer++) {
            System.out.println("Printer Brand = " + printerBrands[printer]);
        }
    }
}