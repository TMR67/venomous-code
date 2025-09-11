class Fan {
    public int blades = 3;
    public String brand = "Crompton";
    public char energyRating = 'A';
    public boolean remoteControl = true;
    public float speed = 320.5f; 
    public long productId = 111122223333L;
    public double price = 2599.50;

    public int numberOfBlades() {
        System.out.println("Blades = " + blades);
        return blades;
    }
    public String fanBrand() {
        System.out.println("Brand = " + brand);
        return brand;
    }
    public char rating() {
        System.out.println("Energy Rating = " + energyRating);
        return energyRating;
    }
    public boolean hasRemote() {
        System.out.println("Remote Control = " + remoteControl);
        return remoteControl;
    }
    public float fanSpeed() {
        System.out.println("Speed = " + speed + " RPM");
        return speed;
    }
    public long fanId() {
        System.out.println("Product ID = " + productId);
        return productId;
    }
    public double fanPrice() {
        System.out.println("Price = ₹" + price);
        return price;
    }
}
