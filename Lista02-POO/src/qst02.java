import java.util.Scanner;

public class qst02 {
    public static void main(String[] args) {
        Scanner scanx = new Scanner(System.in);
        Scanner sacny = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int x = scanx.nextInt();
        System.out.println("Digite o valor de y: ");
        int y = scanx.nextInt();

        troca(x, y);
    }
    public static void troca(int x, int y){
        int aux;
        aux = x;
        x = y;
        y = aux;

        System.out.println("Valores trocados: ");
        System.out.print(x + " ");
        System.out.print(y + " ");
    }
}
