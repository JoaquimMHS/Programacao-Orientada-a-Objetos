import java.util.Scanner;

public class qst08_e_09 {
    public static void s1(){
        double soma = 0;


        for(int i = 1; i <= 50; i++){
            double numerador  = 2 * i - 1;
            double denominador = i;
            soma += numerador / denominador;
        }

        System.out.println("A soma S1 eh: " +soma);
    }

    public static void s2(){
        double  soma = 0;
        double numerador;
        double denominador;
        for(int i = 1; i <= 50; i++){
            numerador = Math.pow(2, i);
            denominador = 51 -i;

            soma += numerador / denominador;
        }
        System.out.println("A soma S2 eh: " +soma);
    }

    public static void s3(){
        double soma = 0;

        for(int i = 1; i <= 10; i++){
            double number = (double) i / (i * i);
            if (i % 2 == 0){
                number *= -1;
            }
            soma += number;
        }
        System.out.println("A soma S3 eh: " +soma);
    }

    public static void main(String[] args){
        int op;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1 - Soma S1 ");
            System.out.println("2 - Soma S2 ");
            System.out.println("3 - Soma S3 ");
            System.out.println("4 - Sair ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    s1();
                    break;
                case 2:
                    s2();
                    break;
                case 3:
                    s3();
                    break;
                case 4:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opçao invalida!");

            }
        }while(op != 4);
    }
}
