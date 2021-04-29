import java.util.ArrayList;
import java.util.List;

public class GuardaPrenda {
  List<BorradorPrenda> borradorPrendas = new ArrayList<BorradorPrenda>();

  public List<BorradorPrenda> ultimoBorrador(){
    return borradorPrendas.last();
  }
  public void guardarBorrador(BorradorPrenda borradorPrenda){
    borradorPrendas.add(borradorPrenda);
  }
}
