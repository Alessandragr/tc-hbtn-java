import java.util.List;

public class Pedido {
    private int codigo;
    private List<Produto> produtos;
    private Cliente clientes;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.clientes = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getClientes() {
        return clientes;
    }
}
