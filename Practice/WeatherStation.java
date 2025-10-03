class WeatherStation {

    public void recordData(String city) {
        System.out.println("Weather data recorded for city: " + city);
    }

    public void recordData(String city, float temperature) {
        System.out.println("Weather data recorded for city: " + city);
        System.out.println("Temperature: " + temperature + " °C");
    }

    public void recordData(String city, float temperature, long pressure) {
        System.out.println("Weather data recorded for city: " + city);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Barometric Pressure: " + pressure + " Pa");
    }

    public void recordData(String city, float temperature, long pressure, boolean isRaining) {
        System.out.println("Weather data recorded for city: " + city);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Barometric Pressure: " + pressure + " Pa");
        System.out.println("Currently Raining: " + isRaining);
    }
}
