
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", codigo, clientes.getNome());
    }
}
