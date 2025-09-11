class Refrigerator {
    public String[] fridgeBrands = {"Whirlpool", "LG", "Samsung", "Godrej"};
    public void fridgeName() {
        System.out.println(fridgeBrands.length);
        for (int fridge= 0; fridge< fridgeBrands.length; fridge++) {
            System.out.println("Refrigerator Brand = " + fridgeBrands[fridge]);
        }
    }
}
