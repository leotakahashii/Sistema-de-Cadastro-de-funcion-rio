public class FuncionarioComissionado extends Colaborador {

    private double vendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, int matricula, double vendas, double percentualCommissao) {
        super(nome, matricula);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }
    
    @Override 
    public double calcularExtras() {
        return vendas * percentualComissao / 100;
    }

    @Override
    public double calcularSalarioFinal() {
        return SALARIO_BASE + calcularExtras();
    }
}
