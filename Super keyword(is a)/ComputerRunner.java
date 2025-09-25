class ComputerRunner {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "Windows", 3.5, 16,
                                     123456789L, 1200.00f, false,
                                     15.6, 8, false,
                                     2.5f, "NVIDIA RTX 3050", 512L, 'F');
        myLaptop.displayLaptop();
    }
}