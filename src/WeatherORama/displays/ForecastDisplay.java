package WeatherORama.displays;

import WeatherORama.interfaces.DisplayElement;
import WeatherORama.interfaces.Observer;
import WeatherORama.models.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public String display() {
		if (currentPressure > lastPressure) {
			return "Forecast: Improving weather on the way!";
		} else if (currentPressure == lastPressure) {
			return "Forecast: More of the same";
		}

		return "Forecast: Watch out for cooler, rainy weather";
	}
}
