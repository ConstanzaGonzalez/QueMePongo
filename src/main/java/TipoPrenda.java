import java.util.ArrayList;
import java.util.List;

public enum TipoPrenda {

  ZAPATO(Categoria.CALZADO, [Material.CUERO, Material.GAMUZA]),
  CAMISA(Categoria.SUPERIOR, [Material.ALGODON]),
  PANTALON(Categoria.INFERIOR, [Material.JEAN, Material.CUERO]);

  private final Categoria categoria;
  private List<Material> materialesValidos;

  TipoPrenda(Categoria categoria, List<Material> materialesValidos){
    this.categoria = categoria;
    this.materialesValidos = materialesValidos;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public List<Material> getMaterialesValidos() {
    return materialesValidos;
  }
}