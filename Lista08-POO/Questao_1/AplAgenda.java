import java.util.ArrayList;
import java.util.Scanner;

public class AplAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            System.out.println("\nComandos: adicionar, listar, consultar, ajuda, sair");
            String comando = sc.nextLine();

            switch (comando) {
                case "adicionar":
                    System.out.println("Tipo (residencial, comercial, celular, email, fax, endereco):");
                    String tipo = sc.nextLine();
                    System.out.println("Nome:");
                    String nome = sc.nextLine();
                    System.out.println("Contato:");
                    String contato = sc.nextLine();

                    switch (tipo) {
                        case "residencial":
                            contatos.add(new ContatoTelefoneResidencial(nome, contato)); break;
                        case "comercial":
                            contatos.add(new ContatoTelefoneComercial(nome, contato)); break;
                        case "celular":
                            contatos.add(new ContatoTelefoneCelular(nome, contato)); break;
                        case "email":
                            contatos.add(new ContatoEmail(nome, contato)); break;
                        case "fax":
                            contatos.add(new ContatoFax(nome, contato)); break;
                        case "endereco":
                            contatos.add(new ContatoEndereco(nome, contato)); break;
                        default:
                            System.out.println("Tipo inválido.");
                    }
                    break;
                case "listar":
                    for (int i = 0; i < contatos.size(); i++) {
                        Contato c = contatos.get(i);
                        System.out.println(i + ": " + c.getNome() + " - " + c.getTipo() + " - " + c.getContato());
                    }
                    break;
                case "consultar":
                    System.out.println("Índice:");
                    int i = Integer.parseInt(sc.nextLine());
                    if (i >= 0 && i < contatos.size()) {
                        Contato c = contatos.get(i);
                        System.out.println(c.getNome() + " - " + c.getTipo() + " - " + c.getContato());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case "ajuda":
                    System.out.println("Comandos: adicionar, listar, consultar, ajuda, sair");
                    break;
                case "sair":
                    executando = false;
                    break;
                default:
                    System.out.println("Comando desconhecido.");
            }
        }
        sc.close();
    }
}
