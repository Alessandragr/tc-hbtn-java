public class Contato {
    private String nome;
    private String tipo;
    private TipoNumero NumeroTelefone;

    public Contato(String nome, String tipo, TipoNumero numeroTelefone) {
        this.nome = nome;
        this.tipo = tipo;
        NumeroTelefone = numeroTelefone;
    }

    public Contato() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoNumero getNumeroTelefone() {
        return NumeroTelefone;
    }

    public void setNumeroTelefone(TipoNumero numeroTelefone) {
        NumeroTelefone = numeroTelefone;
    }
}
