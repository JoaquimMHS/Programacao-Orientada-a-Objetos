package Questão02;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Eu sei dividir!");
         try{
             System.out.println("Informe o primeiro valor: ");
             int x = teclado.nextInt();
             System.out.print("Informe o segundo valor: ");
             int y = teclado.nextInt();
             double r = (x / y);
             System.out.println("O resultado da divisão é " + r);

         }catch(Exception e){
             System.out.println("Digite um número válido!");
         }
     }
}


