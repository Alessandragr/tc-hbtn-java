public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual();
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual>0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome !=null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = this.nome;
        }
    }

    public String getStatus() {
        return this.status;
    }

    public void tomarDano (int quantidadeDeDano) {
        this.saudeAtual = (this.saudeAtual - quantidadeDeDano);
        if(this.saudeAtual<=0) {
            setSaudeAtual(0);
        } else {
            setSaudeAtual(saudeAtual);
        }
    }
    
    public void receberCura (int quantidadeDeCura) {
        this.saudeAtual = this.saudeAtual + quantidadeDeCura;
        if(this.saudeAtual>=100) {
            setSaudeAtual(100);
        } else {
            setSaudeAtual(saudeAtual);
        }
    }
   
    
}
