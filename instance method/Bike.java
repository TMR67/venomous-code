class Bike {
    public String[] bikeBrands = {"Royal Enfield", "Honda", "Yamaha", "Bajaj"};
   
   public void bikeName() {
        System.out.println(bikeBrands.length);
        for (int brand = 0; brand< bikeBrands.length; brand++) {
            System.out.println("Bike Brand = " +bikeBrands[brand]);
        }
    }
}