class WeatherRunner {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        
        station.recordData("Seattle", 12.5f, 101300L, true);

        
        station.recordData("Dubai", 35.0f);
    }
}