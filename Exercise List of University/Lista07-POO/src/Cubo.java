public class Cubo implements Forma3D{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (6 * (lado * lado));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Lado: "+lado);
        System.out.println("Área: "+calcularArea());
        System.out.println("Volume: "+calcularVolume());
    }
}
