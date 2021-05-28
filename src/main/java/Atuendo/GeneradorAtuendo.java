package Atuendo;

import CreacionPrenda.*;

import java.util.List;
import java.util.stream.Collectors;

public class GeneradorAtuendo {
  public Atuendo generarAtuendoCon(List<Prenda> prendas){
    return new Atuendo(algunaPrenda(Categoria.SUPERIOR, prendas),
        algunaPrenda(Categoria.INFERIOR, prendas),
        algunaPrenda(Categoria.CALZADO, prendas),
        algunaPrenda(Categoria.ACCESORIO, prendas));
  }
  public List<Prenda> getPrendaDeCategoria(Categoria categoria, List<Prenda> prendas){
    return prendas.stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
  }
  public Prenda algunaPrenda(Categoria categoria, List<Prenda> prendas){
    return getPrendaDeCategoria(categoria, prendas).stream().filter(prenda -> prenda.temperaturaAdecuada(apiClima.getTemperatura())).findAny();
  }
}
