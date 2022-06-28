import produtos.Produto;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itemPedidos;


    public Pedido(double percentualDesconto, ItemPedido[] itemPedidos) {
        this.percentualDesconto = percentualDesconto;
        this.itemPedidos = itemPedidos;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itemPedidos) {
            total += (1.0-percentualDesconto/100)*(itemPedido.getQuantidade()*itemPedido.getProduto().obterPrecoLiquido());
        }
        return total;
    }

    public double total() {
        double valorFinal=0;
        for (ItemPedido itemPedido : itemPedidos) {

            valorFinal += itemPedido.getProduto().obterPrecoLiquido()*itemPedido.getQuantidade();
        }
        return valorFinal;
    }
    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido itemPedido : itemPedidos) {
            System.out.println("Tipo: " + itemPedido.getClass().getSimpleName()  +
                    String.format("  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f", itemPedido.getProduto().getTitulo(),
                            itemPedido.getProduto().obterPrecoLiquido(), itemPedido.getQuantidade(),
                            itemPedido.getProduto().obterPrecoLiquido()*itemPedido.getQuantidade()));
        }
        System.out.println("----------------------------");
        System.out.println(String.format("DESCONTO: %.2f", (percentualDesconto*total())/100)); // percentual vezes o valor dos itens do array
        System.out.println(String.format("TOTAL PRODUTOS: %.2f", total())); // somatório dos itens do array
        System.out.println("----------------------------");
        System.out.println(String.format("TOTAL PEDIDO: %.2f", calcularTotal()));
        System.out.println("----------------------------");
    }
}
