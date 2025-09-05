import java.util.*;

public class qst06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Digite a quantidade de elementos do vetor: ");
        int tam_vet = scan.nextInt();

        System.out.println("Digite o escalar: ");
        int escalar = scan.nextInt();

        int[] vetor = new int[tam_vet];
        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < tam_vet; i++) {
            vetor[i] = scan.nextInt();
        }
        multiplica(vetor, escalar, tam_vet);
    }
    public static void multiplica(int vet[], int escalar, int tam_vet){
        for (int i = 0; i < tam_vet; i++) {
            vet[i] = vet[i]* escalar;
            System.out.print(vet[i]+ " ");
        }
    }

    }

