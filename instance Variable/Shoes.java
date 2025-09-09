class Shoes {
    public int size = 9;
    public String brand = "Nike";
    public char type = 'S';
    public boolean waterproof = false;
    public float weight = 1.2f;
    public double price = 7499.99;
    public long productId = 554433221100L;

    public void displayShoes() {
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: ₹" + price);
        System.out.println("Product ID: " + productId);
    }
}
