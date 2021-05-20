package Atuendo;

import Prenda.Prenda;

import java.util.Optional;

public class Atuendo {
  Optional<Prenda> superior;
  Optional<Prenda> inferior;
  Optional<Prenda> calzado;
  Optional<Prenda> accesorio;

  public Atuendo(Optional<Prenda> superior, Optional<Prenda> inferior, Optional<Prenda> calzado, Optional<Prenda> accesorio) {
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }
}
