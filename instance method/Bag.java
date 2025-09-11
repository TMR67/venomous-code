class Bag {
    public String[] bagBrands = {"Wildcraft", "Skybags", "American Tourister"};
    public void bagName() {
        System.out.println(bagBrands.length);
        for (int  brand= 0; brand< bagBrands.length; brand++) {
            System.out.println("Bag Brand = " + bagBrands[brand]);
        }
    }
}