public class FuncionarioPadrao extends Colaborador {
    
    
public FuncionarioPadrao(String nome, int matricula) {
        super(nome, matricula);
    }

    @Override
    public double calcularExtras() {
        return 0.0;
  }

    @Override
    public double calcularSalarioFinal() {
        return SALARIO_BASE;
    }
}



