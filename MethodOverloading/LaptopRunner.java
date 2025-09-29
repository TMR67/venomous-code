class LaptopRunner {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell");
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell", "XPS 15");
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6);
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32);
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32, 1000);
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32, 1000, 2.3);
        
        System.out.println();
        myLaptop.displayLaptopDetails("Dell", "XPS 15", 15.6, 32, 1000, 2.3, true);
    }
}