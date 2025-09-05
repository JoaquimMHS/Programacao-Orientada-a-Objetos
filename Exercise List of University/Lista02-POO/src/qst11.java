import java.util.Scanner;

public class qst11 {
    public static void salariosAcimaDaMedia() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos funcionários a empresa possui? ");
        int qtd = scan.nextInt();

        double[] salarios = new double[qtd];
        double soma = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scan.nextDouble();
            soma += salarios[i];
        }

        double media = soma / qtd;
        int acimaDaMedia = 0;


        for (int i = 0; i < qtd; i++) {
            if (salarios[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.printf("A média salarial é: %.2f%n", media);
        System.out.println("Funcionários com salário acima da média: " + acimaDaMedia);


    }

    public static void main(String[] args) {
        salariosAcimaDaMedia();
    }
}

