import Atuendo.Atuendo;
import Prenda.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//La idea es que implementen la misma interfaz Clima, para poder usar disitntos servicios.
public class GeneradorAtuendo {
  Clima apiClima;
  public GeneradorAtuendo(Clima apiClima){
    this.apiClima = apiClima;
  }

  public void setClima(Clima apiClima){
    this.apiClima = apiClima;
  }

  public Atuendo generarAtuendo(List<Prenda> prendas){
    return new Atuendo(algunaPrenda(Categoria.SUPERIOR, prendas),
        algunaPrenda(Categoria.INFERIOR, prendas),
        algunaPrenda(Categoria.CALZADO, prendas),
        algunaPrenda(Categoria.ACCESORIO, prendas));
  }
  public List<Prenda> getPrendaDeCategoria(Categoria categoria, List<Prenda> prendas){
    return prendas.stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
  }
  public Optional<Prenda> algunaPrenda(Categoria categoria, List<Prenda> prendas){
    return getPrendaDeCategoria(categoria, prendas).stream().filter(prenda -> prenda.temperaturaAdecuada(apiClima.getTemperatura())).findAny();
  }
}
