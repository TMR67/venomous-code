class Car {
    public String[] carBrands = {"Hyundai", "Maruti", "Tata", "Toyota"};
    public void carName() {
        System.out.println(carBrands.length);
        for (int i = 0; i < carBrands.length; i++) {
            System.out.println("Car Brand = " + carBrands[i]);
        }
    }
}