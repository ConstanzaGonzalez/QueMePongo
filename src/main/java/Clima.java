import java.util.List;
import java.util.Map;

public interface Clima {
  List<Map<String, Object>> getWeather(String ciudad);
  Double getTemperatura();
}
