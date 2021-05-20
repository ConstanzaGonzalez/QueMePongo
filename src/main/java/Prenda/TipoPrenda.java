package Prenda;

import java.util.Arrays;
import java.util.List;

public enum TipoPrenda {

  ZAPATO(Categoria.CALZADO, Arrays.asList(Material.CUERO, Material.GAMUZA), 20.0),
  CAMISA(Categoria.SUPERIOR, Arrays.asList(Material.ALGODON), 30.0),
  PANTALON(Categoria.INFERIOR, Arrays.asList(Material.JEAN, Material.CUERO), 25.0);

  private final Categoria categoria;
  private List<Material> materialesValidos;
  private Double temperaturaMaxima;

  TipoPrenda(Categoria categoria, List<Material> materialesValidos, Double temperaturaMaxima){
    this.categoria = categoria;
    this.materialesValidos = materialesValidos;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Double getTemperatura(){ return temperaturaMaxima; }

  public List<Material> getMaterialesValidos() {
    return materialesValidos;
  }
}