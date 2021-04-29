public class BorradorPrenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public BorradorPrenda(TipoPrenda tipo){
    this.tipo = tipo;
  }
  public void setMaterial(Material material){
    this.material = material;
  }
  public void setColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
  }
  public void setColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }
  public void setTrama(Trama trama){
    this.trama = trama;
  }
}
