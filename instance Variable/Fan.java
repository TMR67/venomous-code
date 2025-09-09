class Fan {
    public int blades = 3;
    public String brand = "Usha";
    public char energyRating = 'B';
    public boolean isOn = false;
    public float speed = 320.5f;
    public double price = 1899.99;
    public long totalUnitsSold = 2456789L;

    public void displayFan() {
     System.out.println("Fan has " + blades + " blades");
     System.out.println("Brand is " + brand);
     System.out.println("Energy rating: " + energyRating);
	 System.out.println("Is it on? " + isOn);
	 System.out.println("Speed: " + speed + " rpm");
	 System.out.println("Price: ₹" + price);
	 System.out.println("Total units sold: " + totalUnitsSold);
    }
}
