class Country {
    public String countryName;
    public String continent;
    public CapitalCity capital; 

    public Country(String countryName, String continent, CapitalCity capital) {
        this.countryName = countryName;
        this.continent = continent;
        this.capital = capital;
    }

    public void displayCountryDetails() {
        System.out.println("Country Name: " + countryName);
        System.out.println("Continent: " + continent);
        
        System.out.println("Capital City: " + capital.cityName);
        System.out.println("Capital Population: " + capital.populationMillions + " million people");
    }
}