public class Frete implements IFretePlus { // concreto
  
  // é parte da interface porque é público, contrato, assinatura
  // calcula(int, int, int, int): int
  @Override
  public int calcula(int peso, int altura, int largura, int profundidade) {
    return 2 * peso + calculaVolume(altura, largura, profundidade);
  }

  // interface
  @Override
  public int calcula(int peso) {
    return (int) (calcula(peso, 0,0,0) * 0.5);
  }

  // não faz parte da interface (API) porque é privado
  private int calculaVolume(int altura, int largura, int profundidade) {
    return (altura * largura * profundidade);
  }
}
