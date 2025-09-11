class Shoes {
    public int size = 9;
    public String brand = "Nike";
    public char type = 'S';
    public boolean waterproof = false;
    public float weight = 1.2f;
    public long productId = 554433221100L;
    public double price = 7499.99;

    public int shoeSize() {
        System.out.println("Size = " + size);
        return size;
    }
    public String shoeBrand() {
        System.out.println("Brand = " + brand);
        return brand;
    }
    public char shoeType() {
        System.out.println("Type = " + type);
        return type;
    }
    public boolean isWaterproof() {
        System.out.println("Waterproof = " + waterproof);
        return waterproof;
    }
    public float shoeWeight() {
        System.out.println("Weight = " + weight + " kg");
        return weight;
    }
    public long shoeId() {
        System.out.println("Product ID = " + productId);
        return productId;
    }
    public double shoePrice() {
        System.out.println("Price = ₹" + price);
        return price;
    }
}
