public class FuncionarioProducao extends Colaborador {

    private double valorPorPeca;
    private int quantidadeProduzida;
    
    public FuncionarioProducao(String nome, int matricula, double valorPorPeca, int quantidadeProduzida) {
        super(nome, matricula);
        this.valorPorPeca = valorPorPeca;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double calcularExtras() {
        return valorPorPeca * quantidadeProduzida;
    }

    @Override
    public double calcularSalarioFinal() {
        return SALARIO_BASE + calcularExtras();
    }
}
