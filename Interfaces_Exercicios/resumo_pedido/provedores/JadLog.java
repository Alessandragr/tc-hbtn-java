package provedores;

public class JadLog implements ProvedorFrete {

    public JadLog() { }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double total;
        if(peso>2000) {
            total = valor*0.07;
        } else {
            total = valor*0.045;
        }
        return (new Frete(total, TipoProvedorFrete.JADLOG));
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
