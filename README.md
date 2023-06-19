# INTERFACES ("interface dos objetos")

`Application Programming Interface`: interface de programação da aplicação.


```java
class A {
  public static void main(String[] args) {
    List<String> lista = new ArrayList<String>;
    lista.add("Teste"); // API, add é parte da API de List
    // add entra um objeto e devolve boolean, true se adicionado, false caso contrário

    // API de size:
    // retorna int com a quantidade de itens na lista
    System.out.println(lista.size());
  }
}
```

Todo objeto/instância tem uma interface,