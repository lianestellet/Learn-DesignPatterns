package WeatherORama.displays;

import WeatherORama.interfaces.DisplayElement;
import WeatherORama.interfaces.Observer;
import WeatherORama.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String display() {
        return "Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity";
    }



}
