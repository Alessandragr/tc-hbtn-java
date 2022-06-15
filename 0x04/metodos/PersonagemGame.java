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
        int saudeAtual = this.saudeAtual;
        if(saudeAtual<=0) {
            return 0;
        } else {
            saudeAtual -= quantidadeDeDano;
            return saudeAtual;
        }
    }
    public int receberCura (int quantidadeDeCura) {
        int saudeAtual = this.saudeAtual;
        if(saudeAtual>=100) {
            return 100
        } else {
            saudeAtual += quantidadeDeCura;
            return saudeAtual;
        }
    }
    
}
