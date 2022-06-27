public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itemPedidos;


    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itemPedidos = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itemPedidos) {
            total += (1.0-percentualDesconto/100)*(itemPedido.getQuantidade()*itemPedido.getProduto().obterPrecoLiquido());
        }
        return total;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itemPedidos;
    }

    public void setItens(ItemPedido[] itens) {
        this.itemPedidos = itens;
    }
}
