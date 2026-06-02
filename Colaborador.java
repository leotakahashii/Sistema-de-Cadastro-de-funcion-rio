public class Colaborador {
    protected String nome;
    protected int matricula;

    public static final double SALARIO_BASE = 2000.00;

    public Colaborador(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {return nome;}
    public int getMatricula() {return matricula;}

    public double calcularExtras() {
        return 0.0;
    }

    public double calcularSalarioFinal() {
        return SALARIO_BASE;
    }

    public void exibirDados() {
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário Fixo: R$ %.2f%n", SALARIO_BASE);
        System.out.printf("Extras: R$ %.2f%n", calcularExtras());
        System.out.printf("Salário Final: R$ %.2f%n", calcularSalarioFinal());
    }


}