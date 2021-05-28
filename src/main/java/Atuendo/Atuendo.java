package Atuendo;

import CreacionPrenda.Prenda;

public class Atuendo {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;
  private Prenda accesorio;

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado, Prenda accesorio) {
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }
}
