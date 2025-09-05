import java.util.Scanner;

public class qst03 {
    public static void sinal(int n) {
        if (n < 0){
            System.out.println("NEGATIVO!");
        } else if (n > 0) {
            System.out.println("POSITIVO!");
        } else{
            System.out.println("ZERO!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        sinal(n);
    }
}
