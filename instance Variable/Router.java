class Router {
    public int maxDevices = 20;
    public String brand = "TP-Link";
    public char band = 'D'; // D = Dual Band
    public boolean supports5G = true;
    public float speed = 1200.5f; // Mbps
    public double price = 3499.99;
    public long macAddress = 445566778899L;

    public void displayRouter() {
        System.out.println("Max Devices: " + maxDevices);
        System.out.println("Brand: " + brand);
        System.out.println("Band: " + band);
        System.out.println("Supports 5G: " + s
