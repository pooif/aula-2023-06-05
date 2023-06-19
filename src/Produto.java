public class Produto { // concreto

  private String descricao;
  private int preco;
  private int x;

  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public int getPreco() { // é INTERFACE
    return preco;
  }
  public void setPreco(int preco) {
    this.preco = preco;
  }
  @Deprecated
  public int getPeso() {
    return x + 1;
  }

  @Deprecated(forRemoval = true)
  public void setPeso(int peso) {
    this.x = peso;
  }

  public int getMassa() {
    return x;
  }

  public void setMassa(int massa) {
    this.x = massa;
  }
  
  
}
