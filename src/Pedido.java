import java.util.ArrayList;
import java.util.List;

public class Pedido {
  // Pedido depende de Produto, 
  // dependência gera um ACOPLAMENTO
  private List<Produto> produtos = new ArrayList<>();
  private IFrete frete; // Pedido depende de Frete
  // depende da interface de algo

  // depende de uma abstração, menor acoplamento
  public Pedido(IFrete frete) {
    ArrayList
    this.frete = frete;
  }

  public void setFrete(IFrete frete) {
    this.frete = frete;
  }

  public void adicionar(Produto p) {
    produtos.add(0, p);
  }

  public int calculaTotal() {
    // for (int i = 0; i < produtos.size(); i++) {
    //   total += produtos.get(i).getPreco();
    // }
    int totalProduto = produtos.stream()
        .map(Produto::getPreco)
        .reduce(Integer::sum)
        .orElse(0);
    
    int totalFrete = 0;
    for (Produto p : produtos) {
      totalFrete += frete.calcula(p.getPeso());
    }

    return totalProduto + totalFrete;
  }
}
