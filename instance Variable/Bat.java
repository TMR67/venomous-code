class Bat {
    public int size = 6;
    public String brand = "SG";
    public char type = 'C'; // C = Cricket
    public boolean englishWillow = true;
    public float weight = 1.3f; // kg
    public double price = 3499.99;
    public long productCode = 665544332211L;

    public void displayBat() {
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("English Willow: " + englishWillow);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: ₹" + price);
        System.out.println("Product Code: " + productCode);
    }
}
