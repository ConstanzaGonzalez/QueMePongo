package Usuario;

public interface RecomendacionCommand {
  public void execute(Usuario usuario);
  public void deshacer(Usuario usuario);
}
