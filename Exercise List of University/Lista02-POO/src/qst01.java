import java.util.Scanner;
public class qst01 {
    public static double cubo(double number) {
        double cubo;
        cubo = Math.pow(number, 3);
        return cubo;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = scan.nextDouble();
        double resultado = cubo(num);
        System.out.println("O cubo deste numero eh: " + resultado);

    }
}
