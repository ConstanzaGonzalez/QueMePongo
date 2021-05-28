package Usuario;

import CreacionPrenda.Prenda;

public class RecomendacionQuitar implements RecomendacionCommand{
  Prenda prenda;
  Guardaropa guardaropa;

  public RecomendacionQuitar(Prenda prenda, Guardaropa guardaropa) {
    this.prenda = prenda;
    this.guardaropa = guardaropa;
  }
  @Override
  public void execute(Usuario usuario) {
    guardaropa.quitarPrenda(prenda);
  }
  public void deshacer(Usuario usuario) {
    guardaropa.agregarPrenda(prenda);
  }
}
