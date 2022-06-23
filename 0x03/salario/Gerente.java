public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonus = 0.20;
        double salarioFixo = getSalarioFixo();
        double meta = departamento.getValorMeta();
        double salario = departamento.getValorAtingidoMeta();
        double valorBonus;

        if(salario>=meta) {
            valorBonus = (bonus*salarioFixo) + 0.01*(salario-meta);
        } else {
            valorBonus = 0;
        }
        return valorBonus;
    }
}
