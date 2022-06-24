import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeracao() {
        return this.numeracao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        saldo=0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor<1) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            this.saldo = valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor<0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else {
            if (this.saldo>=valor) {
                this.saldo= (this.saldo-valor);
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        }
    }

    public double calcularTarifaMensal() {
        double tarifaFinal;
        double tarifa = 0.10*this.saldo;
        if (tarifa<10) {
            tarifaFinal = tarifa;
        } else {
            tarifaFinal =10;
        }
        return tarifaFinal;
    }

    public double calcularJurosMensal() {
        double juros = this.getTaxaJurosAnual();
        if (this.saldo<=0) {
            juros=0;
        }
        return ((juros / 12)*this.saldo)/100;
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = (this.saldo - calcularTarifaMensal()) + calcularJurosMensal();
    }
}
