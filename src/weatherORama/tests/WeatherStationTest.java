package weatherORama.tests;

import weatherORama.displays.*;
import weatherORama.models.WeatherData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeatherStationTest {

    private WeatherData weatherData;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private ForecastDisplay forecastDisplay;
    private HeatIndexDisplay heatIndexDisplay;
    private StatisticsDisplay statisticsDisplay;

    @Before
    public void setup(){
        weatherData = new WeatherData();
        currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        forecastDisplay = new ForecastDisplay(weatherData);
        statisticsDisplay = new StatisticsDisplay(weatherData);
        heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }

    @Test
    public void currentConditionsDisplayTest(){
        Assert.assertEquals("Current conditions: 80.0F degrees and 65.0% humidity", currentConditionsDisplay.display());
    }

    @Test
    public void statisticDisplayTest(){
        Assert.assertEquals("Avg/Max/Min temperature = 80.0/80.0/80.0", statisticsDisplay.display());
    }

    @Test
    public void forecastDisplayTest(){
        Assert.assertEquals("Forecast: Improving weather on the way!", forecastDisplay.display());
    }

    @Test
    public void heatIndexDisplayTest(){
        Assert.assertEquals("Heat index is 82.95535", heatIndexDisplay.display());
    }

    @Test
    public void currentConditionsDisplayChangingMeasurementsTest(){
        weatherData.setMeasurements(82, 70, 29.2f);
        Assert.assertEquals("Current conditions: 82.0F degrees and 70.0% humidity", currentConditionsDisplay.display());
    }

    @Test
    public void statisticDisplayChangingMeasurementsTest(){
        weatherData.setMeasurements(82, 70, 29.2f);
        Assert.assertEquals("Avg/Max/Min temperature = 81.0/82.0/80.0", statisticsDisplay.display());
    }

    @Test
    public void forecastDisplayChangingMeasurementsTest(){
        weatherData.setMeasurements(82, 70, 29.2f);
        Assert.assertEquals("Forecast: Watch out for cooler, rainy weather", forecastDisplay.display());
    }

}
