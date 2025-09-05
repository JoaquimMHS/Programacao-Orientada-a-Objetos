import java.util.Arrays;
import java.util.Scanner;
public class qst07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vet1 = new int[5];
        int [] vet2 = new int[5];
        int [] vet3 = new int[5];
        System.out.println("Digite os elementos do vetor1: ");
        for (int i = 0; i < 5; i++) {
            vet1[i] = scan.nextInt();
        }
        System.out.println("Digite os elementos do vetor2: ");
        for (int i = 0; i < 5; i++) {
            vet2[i] = scan.nextInt();
        }
        vet3 = soma(vet1, vet2);
        for (int i = 0; i < vet3.length; i++) {
            System.out.print(vet3[i] + " ");
        }
    }
    public static int[] soma(int[] vetor1, int [] vetor2){
        int [] vetor3 = new int[5];
        for (int i = 0; i < 5; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];

        }

        return vetor3;
    }
}
