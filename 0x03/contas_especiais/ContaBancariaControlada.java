public class ContaBancariaControlada extends ContaBancariaBasica {
    double saldoMinimo;
    double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        if (this.getSaldo()<=saldoMinimo) {
            double novoSaldo = this.getSaldo();
            novoSaldo = ((novoSaldo - calcularTarifaMensal()) + calcularJurosMensal())-valorPenalidade;
            setSaldo(novoSaldo);
        } else {
            super.aplicarAtualizacaoMensal();
        }
    }
}
