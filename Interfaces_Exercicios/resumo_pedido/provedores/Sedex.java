package provedores;

public class Sedex implements ProvedorFrete {

    public Sedex() { }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double total;
        if(peso>1000) {
            total = valor*0.10;
        } else {
            total = valor*0.05;
        }
        return (new Frete(total, TipoProvedorFrete.SEDEX));
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
