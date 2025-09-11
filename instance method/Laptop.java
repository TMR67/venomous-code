class Laptop {
    public int ram = 16;
    public String brand = "Dell";
    public char processorGrade = 'A';
    public boolean touchscreen = false;
    public float screenSize = 15.6f;
    public long serialNumber = 9876543210L;
    public double price = 75999.99;

    public int ramSize() {
        System.out.println("RAM = " + ram + " GB");
        return ram;
    }
    public String laptopBrand() {
        System.out.println("Brand = " + brand);
        return brand;
    }
    public char grade() {
        System.out.println("Processor Grade = " + processorGrade);
        return processorGrade;
    }
    public boolean isTouch() {
        System.out.println("Touchscreen = " + touchscreen);
        return touchscreen;
    }
    public float displaySize() {
        System.out.println("Screen Size = " + screenSize + " inches");
        return screenSize;
    }
    public long serialNo() {
        System.out.println("Serial Number = " + serialNumber);
        return serialNumber;
    }
    public double laptopPrice() {
        System.out.println("Price = ₹" + price);
        return price;
    }
}
