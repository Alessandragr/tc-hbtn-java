public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;


    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public String setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual>0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
        return this.status;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void String getStatus() {
        getSaudeAtual();
    }

    public int tomarDano (int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        if(this.saudeAtual<=0) {
            return this.saudeAtual=0;
        } else {
            return this.saudeAtual;
        }
    }
    public int receberCura (int quantidadeDeCura) {
        this.saudeAtual += quantidadeDeCura;
        if(this.saudeAtual>=100) {
            return this.saudeAtual=100;
        } else {
            return this.saudeAtual;
        }
    }
   
    
}
