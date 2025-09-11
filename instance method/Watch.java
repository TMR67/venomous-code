class Watch {
    public String[] watchBrands = {"Fossil", "Titan", "Casio", "Sonata"};
    public void watchName() {
        System.out.println(watchBrands.length);
        for (int clock= 0;clock< watchBrands.length; clock++) {
            System.out.println("Watch Brand = " + watchBrands[clock]);
        }
    }
}