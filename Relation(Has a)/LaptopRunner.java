class LaptopRunner {
    public static void main(String[] args) {
        Processor cpu = new Processor("Intel Core i7", 8);
        
        Laptop myLaptop = new Laptop("Dell XPS 13", 16, cpu);
        
        myLaptop.displayLaptopDetails();
    }
}