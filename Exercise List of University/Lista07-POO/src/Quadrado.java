public class Quadrado implements Forma2D {
    private double lado;

    //Contrutor
    public Quadrado(double lado){
        this.lado = lado;
    }
    //Getters e Setters
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (lado * lado);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Lado: "+lado);
        System.out.println("Área: "+calcularArea());
    }
}
