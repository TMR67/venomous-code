class SmartphoneRunner {
    public static void main(String[] args) {
        Screen iPhoneScreen = new Screen("OLED", 6.1);
        Camera iPhoneCamera = new Camera(48, 2);
        Battery iPhoneBattery = new Battery(3279, true);
        Smartphone iPhone = new Smartphone("Apple iPhone 15", iPhoneScreen, iPhoneCamera, iPhoneBattery);

        iPhone.displayDetails();
    }
}