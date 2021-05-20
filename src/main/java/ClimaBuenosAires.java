import java.util.List;
import java.util.Map;

public class ClimaBuenosAires implements Clima{
  List<Map<String, Object>> condicionesClimaticas;

  public void condicionesClimaticas(AccuWeatherAPI apiClima){
    condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
  }
  public Double temperatura(){
    return (condicionesClimaticas.get(0).get("Temperature").get("Value") - 32 ) * 5 / 9;
  }
}

//GeneradorAtuendo
// generarAtuendo(ver si recibe las prendas o no){
//  filter por temperatura, y random por cada categoria para crear un atuendo.
// 