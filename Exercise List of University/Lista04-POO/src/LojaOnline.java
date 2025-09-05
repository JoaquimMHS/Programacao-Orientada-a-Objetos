import java.util.ArrayList;
import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String opcao = "n";
        String descricao;
        double valor;

        do {
            System.out.print("Deseja cadastrar um novo pedido? (s/n): ");
            opcao = scan.nextLine();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.print("Digite a descrição do produto: ");
                descricao = scan.nextLine();

                System.out.print("Digite o valor do produto: ");
                valor = scan.nextDouble();
                scan.nextLine(); // Limpa o buffer

                pedidos.add(new Pedido(descricao, valor));
                System.out.println(pedidos.get(pedidos.size() - 1).exibirDetalhesDoPedido());
            } else if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Saindo...");
                System.out.println(Pedido.gerarRelatorioGeral());
            } else {
                System.err.println("Opção inválida! Digite 's' ou 'n'.");
            }
        } while (!opcao.equalsIgnoreCase("n"));


    }
}
