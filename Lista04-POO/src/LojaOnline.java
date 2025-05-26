import java.util.ArrayList;
import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String opcao = "n";
        String descricao;
        double valor;

        Pedido Cellphone = new Pedido("Galaxy S25U", 8000);
        Pedido Computer = new Pedido("Acer Nitro 5", 5000);
        Pedido   TV = new Pedido("Smart TV 4K 55", 4500);
        Pedido Tablet = new Pedido("Tab S10", 3000);
        do {
            System.out.print("Deseja cadastrar um novo pedido? ");
            opcao = scan.nextLine();
            if(opcao.equalsIgnoreCase("s")){
                System.out.print("Digite a descrição do produto: ");
                descricao = scan.nextLine();

                System.out.print("Digite o valor do produto: ");
                valor = scan.nextDouble();

                pedidos.add(new Pedido(descricao, valor));

                System.out.println(pedidos.get(pedidos.size()-1).exibirDetalhesDoPedido());
            } else if(opcao.equalsIgnoreCase("n")){
                System.out.print("Saindo..");
            } else{
                System.err.println("Opção invalida!");
            }

        } while (opcao.equalsIgnoreCase(opcao));


    }
}
