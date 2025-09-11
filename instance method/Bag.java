class Bag {
    public String[] bagBrands = {"Wildcraft", "Skybags", "American Tourister"};
    public void bagName() {
        System.out.println(bagBrands.length);
        for (int i = 0; i < bagBrands.length; i++) {
            System.out.println("Bag Brand = " + bagBrands[i]);
        }
    }
}class Watch {
    public String[] watchBrands = {"Fossil", "Titan", "Casio", "Sonata"};
    public void watchName() {
        System.out.println(watchBrands.length);
        for (int i = 0; i < watchBrands.length; i++) {
            System.out.println("Watch Brand = " + watchBrands[i]);
        }
    }
}