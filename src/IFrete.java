// a interface (extraída) do frete

public interface IFrete {
  
  /**
   * Calcula o valor do frete dependendo do peso
   * 
   * @param peso o peso em Kg do produto
   * @return o valor do frete
   * @throws IllegalArgumentException se peso menor que zero
   */ 
  int calcula(int peso);

}
