package Clima;

import java.util.Map;

public class ClimaAccuWeather implements Clima{
  AccuWeatherAPI accuWeatherAPI;

  public ClimaAccuWeather(AccuWeatherAPI accuWeatherAPI) {
    this.accuWeatherAPI = accuWeatherAPI;
  }

  public Double getTemperatura(String ciudad) {
    Map<String, Object> temperatura = (Map<String, Object>) accuWeatherAPI.getWeather(ciudad).get(0).get("Temperature");
    return (Double) temperatura.get("Value");
  }
}
