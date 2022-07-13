public class Produto {
    private String nome;
    private int codigo;
    private CategoriaProduto categoria;
    private double preco;


    public Produto(int codigo, String nome,  CategoriaProduto categoria, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s R$ %.2f", getCodigo(), getNome(), getCategoria(), getPreco() );
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }
}
