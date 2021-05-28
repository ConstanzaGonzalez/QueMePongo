package Usuario;

import CreacionPrenda.Prenda;

public class RecomendacionAgregar implements RecomendacionCommand{
  Prenda prenda;
  Guardaropa guardaropa;

  public RecomendacionAgregar(Prenda prenda, Guardaropa guardaropa) {
    this.prenda = prenda;
    this.guardaropa = guardaropa;
  }

  @Override
  public void execute(Usuario usuario) {
    guardaropa.agregarPrenda(prenda);
  }
  public void deshacer(Usuario usuario) {
    guardaropa.quitarPrenda(prenda);
  }
}
