package provedores;

public class Loggi implements ProvedorFrete {

    public Loggi() { }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double total;
        if(peso>5000) {
            total = valor*0.12;
        } else {
            total = valor*0.04;
        }
        return (new Frete(total, TipoProvedorFrete.LOGGI));
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
