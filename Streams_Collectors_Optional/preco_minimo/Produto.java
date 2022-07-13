
public class Produto {
    private String nome;
    private int codigo;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.preco = preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s R$ %.2f",codigo ,nome ,categoria ,preco);
    }
}
