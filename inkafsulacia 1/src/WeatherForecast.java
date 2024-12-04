public class WeatherForecast {

    private String cityName;
    private double windSpeed;
    private int rainPercentage;
    private boolean willRain;
    private boolean isCloudy;
    private boolean isSunny;

    public WeatherForecast(String cityName, double windSpeed, int rainPercentage, boolean willRain, boolean isCloudy, boolean isSunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.willRain = willRain;
        this.isCloudy = isCloudy;
        this.isSunny = isSunny;
    }

    // Getter and Setter methods for each attribute

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(int rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public boolean isWillRain() {
        return willRain;
    }

    public void setWillRain(boolean willRain) {
        this.willRain = willRain;
    }

    public boolean isCloudy() {
        return isCloudy;
    }

    public void setCloudy(boolean isCloudy) {
        this.isCloudy = isCloudy;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean isSunny) {
        this.isSunny = isSunny;
    }

    // Method to print the entire weather forecast
    public void printWeatherForecast() {
        System.out.println("Weather Forecast for " + cityName + ":");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Chance of Rain: " + rainPercentage + "%");
        System.out.println("Will it rain? " + (willRain ? "Yes" : "No"));
        System.out.println("Is it cloudy? " + (isCloudy ? "Yes" : "No"));
        System.out.println("Is it sunny? " + (isSunny ? "Yes" : "No"));
    }

    // Method to recommend whether the user should go for a walk or not
    public boolean shouldGoForWalk() {
        // Logic for recommendation
        if (isSunny && !willRain && windSpeed <= 10) {
            return true;  // Good weather for a walk
        } else if (rainPercentage < 20 && windSpeed <= 15 && !isCloudy) {
            return true;  // Slightly cloudy, but acceptable for a walk
        } else if (isCloudy && rainPercentage < 40 && windSpeed < 20) {
            return true;  // Cloudy but still okay for a walk
        } else {
            return false;  // Not recommended to go for a walk due to bad weather
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a sample WeatherForecast object
        WeatherForecast forecast = new WeatherForecast("New York", 5.0, 10, false, true, true);

        // Printing the weather forecast
        forecast.printWeatherForecast();

        // Checking whether it's a good day for a walk
        boolean canGoForWalk = forecast.shouldGoForWalk();
        System.out.println("Can I go for a walk? " + (canGoForWalk ? "Yes" : "No"));
    }
}
