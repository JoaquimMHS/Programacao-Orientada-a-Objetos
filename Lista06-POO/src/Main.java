import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op, totalVendas;
        String nome, cpf, setor;
        double salario, percentualComissao;
        ArrayList<Empregado_Fixo> empregadosFixos = new ArrayList<>();
        ArrayList<Empregado_Comissão> empregadosComissao = new ArrayList<>();

        do{
            System.out.println("===== MENU =====\n1 - Cadastrar empregado com salario fixo\n2- Cadastrar empregado com salario + comissao\n3- Listar todos os empregados\n4- Calcular folha de pagamento total\n5-Calcular salário de um empregado (por CPF)\n0- Sair");
            System.out.println("Digite a opcao desejada: ");
            op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do emoregado: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    System.out.println("Digite o CPF do empregado: ");
                    cpf = scan.nextLine();
                    System.out.println("Digite o setor do empregado: ");
                    setor = scan.nextLine();
                    System.out.println("Digite o salario fixo do empregado: ");
                    salario = scan.nextDouble();
                    empregadosFixos.add(new Empregado_Fixo(nome, cpf, setor, salario));
                    System.out.println("Empregado cadastrado!");
                    break;
                case 2:
                    System.out.println("Digite o nome do empregado: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    System.out.println("Digite o CPF do empregado: ");
                    cpf = scan.nextLine();
                    System.out.println("Digite o setor do empregado: ");
                    setor = scan.nextLine();
                    System.out.println("Digite o salario base do empregado: ");
                    salario = scan.nextDouble();
                    System.out.println("Digite o total de vendas do empregado: ");
                    totalVendas = scan.nextInt();
                    System.out.println("Digite o percentual de comissao do empregado: ");
                    percentualComissao = scan.nextDouble();
                    empregadosComissao.add(new Empregado_Comissão(nome, cpf, setor, salario, totalVendas, percentualComissao));
                    System.out.println("Empregado cadastrado!");
                    break;
                case 3:
                    if(empregadosFixos.isEmpty()){
                        System.out.println("Nenhum empregado com salario fixo cadastrado.");

                    }else{
                        System.out.println("Empregados com salario fixo:");
                        for(int i = 0; i < empregadosFixos.size();i++){
                            System.out.println("Nome: " +empregadosFixos.get(i).getNome());
                            System.out.println("CPF: " +empregadosFixos.get(i).getCpf());
                            System.out.println("Setor: " +empregadosFixos.get(i).getSetor());
                        }

                    }
                   if(empregadosComissao.isEmpty()){
                        System.out.println("Nenhum empregado com salario + comissao cadastrado.");
                    }else{
                        System.out.println("Empregados com salario + comissao:");
                        for(int i = 0; i < empregadosComissao.size(); i++){
                            System.out.println("Nome: " +empregadosComissao.get(i).getNome());
                            System.out.println("CPF: " +empregadosComissao.get(i).getCpf());
                            System.out.println("Setor: " +empregadosComissao.get(i).getSetor());
                        }
                    }
                    break;
                case 4:
                    double folhaPagamento = 0;
                    for(int i = 0; i < empregadosFixos.size(); i++){
                        folhaPagamento += empregadosFixos.get(i).getSalario();
                    }
                    for(int i = 0; i < empregadosComissao.size(); i++){
                        percentualComissao = empregadosComissao.get(i).getTotalVendas() * empregadosComissao.get(i).getPercentualComissao();
                        folhaPagamento += empregadosComissao.get(i).getSalario() + percentualComissao;
                    }
                    System.out.println("Total da folha de pagamento: R$ " + folhaPagamento);
                    break;
                case 5:
                    System.out.print("\nDigite o CPF do empregado: ");
                    scan.nextLine();
                    String cpfBusca = scan.nextLine();
                    boolean encontrado = false;


                    for(Empregado_Fixo emp : empregadosFixos){
                        if(emp.getCpf().equals(cpfBusca)){
                            System.out.println("\nEmpregado encontrado (salário fixo):");
                            System.out.println("Nome: " + emp.getNome());
                            System.out.println("CPF: " + emp.getCpf());
                            System.out.println("Setor: " + emp.getSetor());
                            System.out.println("Salário: R$ " + emp.getSalario());
                            encontrado = true;
                            break;
                        }
                    }


                    if(!encontrado){
                        for(Empregado_Comissão emp : empregadosComissao){
                            if(emp.getCpf().equals(cpfBusca)){
                                double salarioTotal = emp.getSalario() + (emp.getTotalVendas() * emp.getPercentualComissao());
                                System.out.println("\nEmpregado encontrado (salário + comissão):");
                                System.out.println("Nome: " + emp.getNome());
                                System.out.println("CPF: " + emp.getCpf());
                                System.out.println("Setor: " + emp.getSetor());
                                System.out.println("Salário base: R$ " + emp.getSalario());
                                System.out.println("Total de vendas: " + emp.getTotalVendas());
                                System.out.println("Percentual de comissão: " + (emp.getPercentualComissao() * 100) + "%");
                                System.out.println("Salário total: R$ " + salarioTotal);
                                encontrado = true;
                                break;
                            }
                        }
                    }

                    if(!encontrado){
                        System.out.println("\nNenhum empregado encontrado com o CPF informado.");
                    }
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while(op != 0);
        
    }
}
