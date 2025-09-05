import java.util.Scanner;

public class qst05 {
    public static int pares(int[] vet){
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int qtPares;
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha o vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        qtPares = pares(vetor);
        System.out.println("A quantidade de pares eh: " +qtPares);


    }
}
