package Uniforme;

public class SantaCruz  extends CreadorUniforme{

  protected Prenda crearPrendaSuperior(){
    return new Prenda(TipoPrenda.CAMISA,Material.ALGODON,"#0000", "#2345",Trama.CUADROS );
  }
  protected Prenda crearPrendaInferior(){
    return new Prenda(TipoPrenda.PANTALON,Material.ALGODON,"#0000", "#2345",Trama.LISA );
  }
  protected Prenda crearPrendaCalzado(){
    return new Prenda(TipoPrenda.ZAPATO,Material.GAMUZA,"#0000", "#2345", Trama.LUNARES );
  }
}
