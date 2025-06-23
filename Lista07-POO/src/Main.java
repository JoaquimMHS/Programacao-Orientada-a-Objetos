import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        Random random = new Random();

        // Criando 10 formas aleatórias
        for (int i = 0; i < 10; i++) {
            Forma forma = criarForma(random);
            formas.add(forma);
        }

        // Imprimindo as áreas de todas as formas
        System.out.println("=== Áreas das Formas Criadas ===");
        for (Forma forma : formas) {
            System.out.printf("Tipo: %s - Área: %.2f%n",
                    forma.getClass().getSimpleName(),
                    forma.calcularArea());
        }
    }

    public static Forma criarForma(Random random) {
        int tipo = random.nextInt(6); // Gera número de 0 a 5
        double valor1 = 1 + random.nextDouble() * 9; // Valores entre 1.0 e 10.0
        double valor2 = 1 + random.nextDouble() * 9; // Segundo valor para formas que precisam

        switch (tipo) {
            case 0:
                return new Circulo(valor1);
            case 1:
                return new Quadrado(valor1);
            case 2:
                return new Triangulo(valor1, valor2);
            case 3:
                return new Cubo(valor1);
            case 4:
                return new Esfera(valor1);
            case 5:
                return new Cilindro(valor1, valor2);
            default:
                return new Circulo(1.0); // Default, nunca deve acontecer
        }
    }
}