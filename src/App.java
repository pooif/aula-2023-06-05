public class App {
  public static void main(String[] args) {
    String s = "teste";
              //01234
    System.out.println(s.substring(1, 4));

    Carreto carreto = new Carreto();

    Frete f = new Frete();

    Produto p1 = new Produto();
    p1.setDescricao("Chocolate");
    p1.setPreco(2);
    p1.setPeso(5);

    Produto p2 = new Produto();
    p2.setDescricao("Quentão");
    p2.setPreco(1);
    p2.setPeso(3);

    Pedido pedido = new Pedido(f);
    pedido.adicionar(p1);
    pedido.adicionar(p2);
    System.out.println(pedido.calculaTotal()); // Frete
    pedido.setFrete(carreto);
    System.out.println(pedido.calculaTotal()); // Carreto
    pedido.setFrete(new Gratis());
    System.out.println(pedido.calculaTotal()); // Grátis
    
    FreteLight fl = new FreteLight();

    Pedido pedido2 = new Pedido(fl);
    System.out.println(pedido2.calculaTotal());
    // f.calculaVolume(3,4,5);
  }
}


// interface Escudo { // interface define comportamento abstrato
//   // define o que é feito, não como é feito
//   // gasto do escuto
//   int defesa(Ataque a) {}

//   default int defender() {
//     return defesa(new Ataque());
//   }
// }