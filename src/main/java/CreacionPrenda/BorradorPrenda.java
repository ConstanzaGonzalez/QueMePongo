package Prenda;

public class BorradorPrenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;
//Builder, si quiero crear la prenda no necesito pasarle nada en el constructor,
// lo creo solo directamente, y despues le voy agregando todo lo que necesita para ser una prenda de verdad

  public BorradorPrenda(TipoPrenda tipo){
    validarTipoNoNull(tipo);
    this.tipo = tipo;
  }
  public void setMaterial(Material material){
    validarMaterialNoNull(material);
    this.material = material;
  }
  public void setColorPrincipal(Color colorPrincipal){
    validarColorPrincipalNoNull(colorPrincipal);
    this.colorPrincipal = colorPrincipal;
  }
  public void setColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }
  public void setTrama(Trama trama){
    this.trama = trama;
  }
  public void crearPrenda(){
    validarTrama(trama);
    validarMaterial(tipo, material);
    new Prenda(tipo,  material,  colorPrincipal,  colorSecundario,  trama);
  }

  protected void validarTipoNoNull(TipoPrenda tipo) {
    if (tipo == null ) throw new PrendaInvalidaException("Falta el tipo de prenda");
  }
  protected void validarMaterialNoNull(Material material) {
    if (material == null ) throw new PrendaInvalidaException("Falta el material");
  }
  protected void validarColorPrincipalNoNull(Color colorPrincipal) {
    if (colorPrincipal == null ) throw new PrendaInvalidaException("Falta el color principal");
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
