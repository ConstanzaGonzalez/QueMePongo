package Usuario;

import Atuendo.Atuendo;
import sun.nio.cs.ArrayEncoder;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private Guardaropa guardaropa;
  private List<Guardaropa> guardaropas = new ArrayList<Guardaropa>();
  private List<RecomendacionCommand> recomendaciones = new ArrayList<RecomendacionCommand>();
  private List<RecomendacionCommand> recomendacionesAceptadas = new ArrayList<RecomendacionCommand>();

  private Atuendo sugerirAtuendo(){
    return guardaropa.sugerirAtuendo();
  }
  private void agregarGuardaropa(Guardaropa guardaropa){
    guardaropas.add(guardaropa);
  }
  private void agregarRecomendacion(RecomendacionCommand recomendacion){
    recomendaciones.add(recomendacion);
  }
  protected void aceptar(RecomendacionCommand recomendacion){
    recomendacion.execute(this);
    quitarRecomendacion(recomendacion);
    recomendacionesAceptadas.add(recomendacion);
  }
  protected void rechazar(RecomendacionCommand recomendacion){
    quitarRecomendacion(recomendacion);
  }
  protected void quitarRecomendacion(RecomendacionCommand recomendacion){
    recomendaciones.remove(recomendacion);
  }
  protected void deshacerRecomendacion(RecomendacionCommand recomendacion){
    recomendacion.deshacer(this);
  }
}
