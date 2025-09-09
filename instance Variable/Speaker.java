class Speaker {
    public int powerOutput = 60;
    public String brand = "JBL";
    public char connectivity = 'B'; 
    public boolean waterproof = true;
    public float weight = 2.4f;
    public double price = 7499.49;
    public long serialNo = 334455667788L;

    public void displaySpeaker() {
        System.out.println("Power Output: " + powerOutput + " W");
        System.out.println("Brand: " + brand);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: ₹" + price);
        System.out.println("Serial No: " + serialNo);
    }
}
