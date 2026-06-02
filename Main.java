import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Colaborador> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n======== Folha Pagamento ========");
            System.out.println("1. Cadastrar Funcionário Padrão");
            System.out.println("2. Cadastrar Funcionário de Produção");
            System.out.println("3. Cadastrar Funcionário Comissionado");
            System.out.println("4. Gerar Folha de Pagamento");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome1 = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula1 = sc.nextInt();
                    lista.add(new FuncionarioPadrao(nome1, matricula1));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula2 = sc.nextInt();
                    System.out.print("Valor por Peça: ");
                    double valorPorPeca = sc.nextDouble();
                    System.out.print("Quantidade Produzida: ");
                    int quantidadeProduzida = sc.nextInt();
                    lista.add(new FuncionarioProducao(nome2, matricula2, valorPorPeca, quantidadeProduzida));
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nome3 = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula3 = sc.nextInt();
                    System.out.print("Total de Vendas: ");
                    double vendas = sc.nextDouble();
                    System.out.print("Percentual de Comissão: ");
                    double percentualComissao = sc.nextDouble();
                    lista.add(new FuncionarioComissionado(nome3, matricula3, vendas, percentualComissao));
                    break;
                    
                case 4:
                    System.out.println("\n======== Folha de Pagamento ========");
                    System.out.println("Total cadaastrado: " + lista.size());
                    for (Colaborador c : lista) {
                        c.exibirDados();
                    }
                    break;
                
                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
    
}
