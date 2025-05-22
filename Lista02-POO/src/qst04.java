import java.util.Scanner;

public class qst04 {
    public static void sinal(int number) {
        if (number < 0){
            System.out.println("Eh menor que zero! ");
        } else if (number > 0) {
            System.out.println("Eh maior que zero! ");
        }else {
            System.out.println("Eh igual a zero! ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        sinal(n);
    }
}
