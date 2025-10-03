class CountryRunner {
    public static void main(String[] args) {
        CapitalCity capital1 = new CapitalCity("New Delhi", 19);

        Country nation = new Country("India", "Asia", capital1);

        nation.displayCountryDetails();
    }
}