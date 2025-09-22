public class LaptopRunner {
    public static void main(String[] args) {
        Processor gamingProcessor = new Processor("Intel Core i9-13900HX", 24);
        GraphicsCard gamingGPU = new GraphicsCard("NVIDIA GeForce RTX 4080", 12);
        Storage gamingStorage = new Storage("SSD", 1000);
		 GamingLaptop gamingLaptop = new GamingLaptop("Dell", "Alienware m18", gamingProcessor, gamingGPU, gamingStorage);
        
        Processor businessProcessor = new Processor("Intel Core i7-1370P", 14);
        GraphicsCard businessGPU = new GraphicsCard("Intel Iris Xe Graphics", 0);
        Storage businessStorage = new Storage("SSD", 512);
        BusinessLaptop businessLaptop = new BusinessLaptop("Lenovo", "ThinkPad X1 Carbon Gen 11", businessProcessor, businessGPU, businessStorage);

        Processor ultrabookProcessor = new Processor("Apple M2", 8);
        GraphicsCard ultrabookGPU = new GraphicsCard("Integrated Apple GPU", 0);
        Storage ultrabookStorage = new Storage("SSD", 256);
        Ultrabook ultrabook = new Ultrabook("Apple", "MacBook Air M2", ultrabookProcessor, ultrabookGPU, ultrabookStorage);
        
       
        gamingLaptop.displayDetails();
        
        businessLaptop.displayDetails();
        
        ultrabook.displayDetails();
    }
}