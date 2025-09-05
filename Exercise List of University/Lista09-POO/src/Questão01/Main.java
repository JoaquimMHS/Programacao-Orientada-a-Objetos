package Questão01;

public class Main {
    public static void main(String[] args){
        int[] vetor = new int[] {2, 4, 6, 8, 10, 12};
        for (int i = 0; i <= 12; i++) {
            System.out.println(vetor[i]);
        }
        try{
            for (int i = 0; i <= 12; i++) {
                System.out.println(vetor[i]);
            }
        } catch (Exception e){
            System.out.println("Erro: Você tentou acessar uma posição inválida!");
        }

    }
}
