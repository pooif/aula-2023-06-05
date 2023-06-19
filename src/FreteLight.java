// FreteLight depende de Frete
// é acoplado à frete

// ICalcula
// ISalta
// IPressiona

public class FreteLight extends Frete {
  
  @Override // sobrescrita/anulou
  public int calcula(int peso) {
    return (int) (super.calcula(peso) / 2.0);
  }

}
