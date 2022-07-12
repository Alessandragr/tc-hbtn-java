import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;

    Supplier<Double> precoComMarkup = () -> (preco*(1+percentualMarkup));

    Consumer<Double> atualizarMarkup = valor -> this.percentualMarkup = (valor/100);

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }

    public void setPrecoComMarkup(Supplier<Double> precoComMarkup) {
        this.precoComMarkup = precoComMarkup;
    }

    public Consumer<Double> getAtualizarMarkup() {
        return atualizarMarkup;
    }

    public void setAtualizarMarkup(Consumer<Double> atualizarMarkup) {
        this.atualizarMarkup = atualizarMarkup;
    }
}
