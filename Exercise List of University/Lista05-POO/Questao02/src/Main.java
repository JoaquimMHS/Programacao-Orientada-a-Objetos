import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        int op;

        do {
            System.out.println("\nLivraria");
            System.out.println("(1) Cadastrar Livro");
            System.out.println("(2) Cadastrar Pessoa");
            System.out.println("(3) Realizar Emprestimo");
            System.out.println("(4) Devolver Livro");
            System.out.println("(5) Listar Livros");
            System.out.println("(6) Listar Emprestimos");
            System.out.println("(0) Sair");
            System.out.print("Escolha uma opção: ");
            op = scan.nextInt();
            scan.nextLine(); // Limpar buffer

            switch (op) {
                case 1:
                    System.out.print("Nome do Livro: ");
                    String nomeLivro = scan.nextLine();
                    System.out.print("Nome do Autor: ");
                    String autor = scan.nextLine();
                    livros.add(new Livro(nomeLivro, autor, false));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome da Pessoa: ");
                    String nomePessoa = scan.nextLine();
                    System.out.print("CPF da Pessoa: ");
                    String cpf = scan.nextLine();
                    pessoas.add(new Pessoa(nomePessoa, cpf));
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                case 3:
                    if (livros.isEmpty() || pessoas.isEmpty()) {
                        System.out.println("Cadastre pelo menos um livro e uma pessoa antes de realizar empréstimo.");
                        break;
                    }
                    System.out.println("Pessoas cadastradas:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    System.out.print("Escolha o índice da pessoa: ");
                    int idxPessoa = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Livros disponíveis:");
                    boolean temDisponivel = false;
                    for (int i = 0; i < livros.size(); i++) {
                        if (!livros.get(i).getEmprestado()) {
                            System.out.println(i + " - " + livros.get(i).getTitulo());
                            temDisponivel = true;
                        }
                    }
                    if (!temDisponivel) {
                        System.out.println("Nenhum livro disponível para empréstimo.");
                        break;
                    }
                    System.out.print("Escolha o índice do livro: ");
                    int idxLivro = scan.nextInt();
                    scan.nextLine();
                    Livro livroEmp = livros.get(idxLivro);
                    if (!livroEmp.getEmprestado()) {
                        livroEmp.emprestar();
                        Emprestimo emp = new Emprestimo(pessoas.get(idxPessoa), livroEmp, LocalDate.now());
                        emprestimos.add(emp);
                        System.out.println("Empréstimo realizado com sucesso!");
                    } else {
                        System.out.println("Livro já está emprestado.");
                    }
                    break;
                case 4:
                    System.out.println("Livros emprestados:");
                    ArrayList<Livro> livrosEmprestados = new ArrayList<>();
                    for (Livro l : livros) {
                        if (l.getEmprestado()) {
                            livrosEmprestados.add(l);
                        }
                    }
                    if (livrosEmprestados.isEmpty()) {
                        System.out.println("Nenhum livro emprestado.");
                        break;
                    }
                    for (int i = 0; i < livrosEmprestados.size(); i++) {
                        System.out.println(i + " - " + livrosEmprestados.get(i).getTitulo());
                    }
                    System.out.print("Escolha o índice do livro para devolver: ");
                    int idxDev = scan.nextInt();
                    scan.nextLine();
                    Livro livroDev = livrosEmprestados.get(idxDev);
                    livroDev.devolver();
                    System.out.println("Livro devolvido com sucesso!");
                    break;
                case 5:
                    System.out.println("Lista de Livros:");
                    for (Livro l : livros) {
                        System.out.println(l);
                    }
                    break;
                case 6:
                    System.out.println("Lista de Empréstimos:");
                    for (Emprestimo e : emprestimos) {
                        System.out.println(e);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);

        scan.close();
    }
}