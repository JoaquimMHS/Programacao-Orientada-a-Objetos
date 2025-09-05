import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contato contato;
        Agenda agenda = new Agenda();
        String nome, telefone, email, infoContato;
        int op;

        do{
            System.out.println("(1) Adicionar Contato\n (2) Remover Contato\n (3) Buscar Contato\n (4) Listar Contatos\n (0) Sair\n");
            op = scan.nextInt();
            scan.nextLine();
            switch(op){
                case 1:
                    System.out.println("Inserindo Contato.");
                    System.out.println("Nome: ");
                    nome = scan.nextLine();
                    System.out.println("Telefone: ");
                    telefone = scan.nextLine();
                    System.out.println("Email: ");
                    email = scan.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone, email));
                    break;
                case 2:
                    System.out.println("Digite o nome do contato:");
                    nome = scan.nextLine();
                    if(agenda.removerContato(nome)){
                        System.out.println("Contato removido com sucesso!");
                    }else{
                        System.out.println("Contato nao removido!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do contato:");
                    nome = scan.nextLine();
                    contato = agenda.buscarContato(nome);
                    if(contato == null){
                        System.out.println("Contato nao encontrado!");
                    }else{
                        infoContato = contato.toString();
                        System.out.println(infoContato);
                    }
                    break;
                case 4:
                    System.out.println("Todos os contatos:");
                    agenda.listarContatos();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }while(op!=0);
    }
}
