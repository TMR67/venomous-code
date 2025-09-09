class Television {
    public int sizeInInches = 55;
    public String brand = "Sony";
    public char panelType = 'O'; 
    public boolean isSmart = true;
    public float refreshRate = 120.5f;
    public double price = 84999.99;
    public long serialNumber = 123456789012L;

    public void displayTelevision() {
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("Brand: " + brand);
        System.out.println("Panel Type: " + panelType);
        System.out.println("Smart TV: " + isSmart);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
        System.out.println("Price: ₹" + price);
        System.out.println("Serial Number: " + serialNumber);
    }
}
