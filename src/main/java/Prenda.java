public class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, Color colorSecundario, Trama trama) {
    this.validarCreacionPrenda(tipo, material, colorPrincipal);
    this.tipo = tipo;
    this.validarMaterial(tipo, material);
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.validarTrama(trama);
  }

  protected void validarCreacionPrenda(TipoPrenda tipo, Material material, Color colorPrincipal) {
    if (tipo == null || material == null || colorPrincipal == null) {
      throw new PrendaInvalidaException(
          "Falta el tipo de prenda"
      );
    }
  }

  public Categoria getCategoria(){
    return tipo.getCategoria();
  }

  protected void validarTrama(Trama trama){
    if (trama == null) this.trama = trama.tramaPorDefecto();
    else this.trama = trama;
  }
  protected void validarMaterial(TipoPrenda tipo, Material material){
    if (!tipo.getMaterialesValidos().contains(material)){
      throw new PrendaInvalidaException(
          "Ingresaste un material que no coincide con el tipo de prenda"
      );
    }
  }
}

