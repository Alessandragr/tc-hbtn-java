

public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

   public void apresentar() {
    System.out.print("Codigo: " + this.codigo + "\n" + 
                        "Nome: " + this.nome + "\n" + 
                        "Bairro: " + endereco.getBairro() + "\n" + 
                        "Cidade: " + endereco.getCidade() + "\n" + 
                        "Pais: " + endereco.getPais());
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
