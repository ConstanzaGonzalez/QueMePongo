import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public final class AccuWeatherAPI implements Clima{
  private Double montoCobrar = 0.0;
  private Map<LocalDateTime,Double> cantidadLlamadosPorDia = new HashMap<LocalDateTime,Double>();

  public final List<Map<String, Object>> getWeather(String ciudad) {
    agregarRegistroConsulta();
    return Arrays.asList(new HashMap<String, Object>(){{
      put("DateTime", "2019-05-03T01:00:00-03:00");
      put("EpochDateTime", 1556856000);
      put("WeatherIcon", 33);
      put("IconPhrase", "Clear");
      put("IsDaylight", false);
      put("PrecipitationProbability", 0);
      put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
      put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
      put("Temperature", new HashMap<String, Object>(){{
        put("Value", 57);
        put("Unit", "F");
        put("UnitType", 18);
      }});
    }});
  }
  public Double getTemperatura(){
    Map<String, Object> weatherApi = getWeather("Buenos Aires, Argentina").get(0);
    return weatherApi.get("Temperature").get("Value");
  }
  public Double costoConsultas(){
    return montoCobrar;
  }
  public void agregarRegistroConsulta(){
    LocalDate hoy = new LocalDate.now();
    if (cantidadLlamadosPorDia.containsKey(hoy)) sumarConsulta(hoy);
    else (cantidadLlamadosPorDia.put(hoy, 1.0));
  }
  public void sumarConsulta(LocalDate hoy){
    Double valor = cantidadLlamadosPorDia.get(hoy);
    validarCantidadConsulta(valor);
    cantidadLlamadosPorDia.put(hoy, valor + 1.0);
  }
  public void validarCantidadConsulta(Double valor){
    if (valor >= 10.0) cobrar();
  }
  public void cobrar(){
    montoCobrar += 0.05;
  }
}