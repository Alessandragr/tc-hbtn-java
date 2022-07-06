import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, Double valorInicialTransacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
        adicionarTransacao(valorInicialTransacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTransacoes(ArrayList<Double> transacoes) {
        this.transacoes = transacoes;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(Double valorTransacao) {
        transacoes.add(valorTransacao);
    }
}
