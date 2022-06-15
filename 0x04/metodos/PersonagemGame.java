public class PersonagemGame {
    private int saudeAtual;
    private String nome;


    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int tomarDano (int quantidadeDeDano) {
        if(this.saudeAtual>=0) {
            this.saudeAtual -= quantidadeDeDano;
            return this.saudeAtual;
        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }
    public int receberCura (int quantidadeDeCura) {
        if(this.saudeAtual<=100) {
            this.saudeAtual += quantidadeDeCura;
            return this.saudeAtual;

        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }
    
}
