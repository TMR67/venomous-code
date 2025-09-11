class Bottle {
    public int capacity = 1000;
    public String brand = "Milton";
    public char materialGrade = 'A';
    public boolean insulated = true;
    public float weight = 0.45f; 
    public long productCode = 12345098765L;
    public double price = 799.49;

    public int bottleCapacity() {
        System.out.println("Capacity = " + capacity + " ml");
        return capacity;
    }
    public String bottleBrand() {
        System.out.println("Brand = " + brand);
        return brand;
    }
    public char grade() {
        System.out.println("Material Grade = " + materialGrade);
        return materialGrade;
    }
    public boolean isInsulated() {
        System.out.println("Insulated = " + insulated);
        return insulated;
    }
    public float bottleWeight() {
        System.out.println("Weight = " + weight + " kg");
        return weight;
    }
    public long code() {
        System.out.println("Product Code = " + productCode);
        return productCode;
    }
    public double bottlePrice() {
        System.out.println("Price = ₹" + price);
        return price;
    }
}
