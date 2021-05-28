package Uniforme;

import CreacionPrenda.Prenda;

public abstract class CreadorUniforme {

  public Uniforme crearUniforme(){
    return new Uniforme(this.crearPrendaSuperior(), this.crearPrendaInferior(), this.crearPrendaCalzado());
  }
  protected abstract Prenda crearPrendaSuperior();
  protected abstract Prenda crearPrendaInferior();
  protected abstract Prenda crearPrendaCalzado();

}


