public class Esfera implements Forma3D{
    private double raio;
    //Construtor
    public Esfera(double raio){
        this.raio = raio;
    }
    //Getters e Setters
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (4 * Math.PI * (raio * raio));
    }

    @Override
    public double calcularVolume() {
        return (4*Math.PI*(raio * raio))/3;
    }

    @Override
    public void imprimirDados() {
        System.out.println("lado: "+raio);
        System.out.println("Área: "+calcularArea());
        System.out.println("Volume: "+calcularVolume());
    }
}
