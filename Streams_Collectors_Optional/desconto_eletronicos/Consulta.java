
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(pedido -> pedido.getProdutos()
                        .stream()
                        .anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                        .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .peek(produto -> {
                    if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
                        produto.setPreco(produto.getPreco()*0.85);
                }).collect(Collectors.toList());
    }
}
