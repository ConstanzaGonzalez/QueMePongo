package CreacionPrenda;

public class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, Color colorSecundario, Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Categoria getCategoria(){
    return tipo.getCategoria();
  }
  public Boolean temperaturaAdecuada(Double temperaturaActual){
    return tipo.getTemperatura() >= temperaturaActual;
  }
}

