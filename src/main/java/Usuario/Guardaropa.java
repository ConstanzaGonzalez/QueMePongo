package Usuario;

import Atuendo.*;
import Clima.ClimaAccuWeather;
import CreacionPrenda.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardaropa  {
  private List<Prenda> prendas = new ArrayList<Prenda>();
  private ClimaAccuWeather clima;
  private GeneradorAtuendo generadorAtuendo;

  public Guardaropa(ClimaAccuWeather clima, GeneradorAtuendo generadorAtuendo) {
    this.clima = clima;
    this.generadorAtuendo = generadorAtuendo;
  }

  public Atuendo sugerirAtuendo(){
    Double temperatura = clima.getTemperatura("Buenos Aires, Argentina");
    return obtenerAtuendoPara(temperatura);
  }

  private Atuendo obtenerAtuendoPara(Double temperatura){
    return generadorAtuendo.generarAtuendoCon(prendasTemperaturaAdecuada(temperatura));
  }

  private List<Prenda> prendasTemperaturaAdecuada(Double temperatuar){
    return prendas.stream().filter(prenda -> prenda.temperaturaAdecuada(temperatuar)).collect(Collectors.toList());
  }
  protected void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }
  protected void quitarPrenda(Prenda prenda){
    prendas.remove(prenda);
  }
}
